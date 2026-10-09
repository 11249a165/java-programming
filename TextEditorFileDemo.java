import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextEditorFileDemo {
    public static void  main(String[] args){
        String fileName = "document.txt";
        String editorContent = "Welcome to the text editor!\n"+
                                "This content was written using FileWriter.\n" +
                               "It reads characters directly using FileReader.";

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(editorContent);
            System.out.println("Successfully wrote text content to " + fileName);
        }
        catch (IOException e){
            System.out.println("An error occurre3d while wiriting: " +e.getMessage());

        }

        System.out.println("\nReading content back from" +fileName + ":\n");
        try (FileReader reader = new FileReader(fileName)){
            int character;

            while ((character = reader.read()) !=-1){
                System.out.print((char) character);
            }
        }
        catch (IOException e){
            System.out.println("An error occurred while reading :" +e.getMessage());
        }                       
    }
    
}
