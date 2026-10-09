import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FitnessAppProfile {
    public static void main(String[] args ){
      String fileName = "user_profile.txt";
      String profileData = "Name: Alex Smith \nAge: 28 \nWeight: 72.3kgs \nHeight: 182cm\nGoal: Muscle gain";

      try (FileOutputStream fos = new FileOutputStream(fileName)){

        byte[] dataBytes = profileData.getBytes();
        fos.write(dataBytes);
        System.out.println(" user profile sucessfully written to " +fileName);
      }
      catch (IOException e){
        System.out.println(" An erro occured while writing the file:" +e.getMessage());
      }

      System.out.println("\nReading user profile from " + fileName + ":");
      try (FileInputStream fis = new FileInputStream(fileName)){
        int byteData;

        while ((byteData = fis.read()) !=0){
            System.out.print((char) byteData);
        }
      }
      catch (IOException e){
        System.out.println("An eroor occured while reading file" +e.getMessage());
      }
    }
}