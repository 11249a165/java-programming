import java.io.*;
import java.net.*;

public class Server {
   public static void main (String[] args){
    int port = 5000;
    System.out.println("Starting Server....");
    try (ServerSocket serverSocket = new ServerSocket(port)){
        System.out.println("Server is listening on port " +port);

        Socket socket = serverSocket.accept();
        System.out.println("Client connected successfully!");

            // Read message sent by the client
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String message = reader.readLine();
        System.out.println("Received from client: " + message);

            // Send response back to the client
        PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
        writer.println("Hello from Server! Message received successfully.");
    }
    catch (IOException e) {
            System.out.println("Server error: " + e.getMessage());
    }
   } 
}
