import java.util.Scanner;  
public class LibraryBooks {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);

    String[] books = new String[10];
    System.out.println("Enter titles of 10 books:");
    for (int i=0; i<10; i++){
        System.out.print("Book" +(i+1)+ ": ");
        books[i]=sc.nextLine();
    }

     System.out.println("\nBooks starting with letter 'A':");
        for (int i = 0; i < 10; i++) {
            if (books[i].startsWith("A") || books[i].startsWith("a")) {
                System.out.println(books[i]);
            }
        }
    
    sc.close();
 }
}
