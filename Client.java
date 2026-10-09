import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        String hostname = "localhost";
        int port = 5000;

        try (Socket socket = new Socket(hostname, port)) {
            System.out.println("Connected to the server!");

            // Send message to the server
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            writer.println("Hello Server, I am the client!");

            // Read the response from the server
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String response = reader.readLine();
            System.out.println("Response from server: " + response);

        } catch (UnknownHostException e) {
            System.out.println("Server not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O error: " + e.getMessage());
        }
    }
}





