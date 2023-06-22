import java.util.Scanner;

public class ScannerPrueba2 {
    public static void main (String []args) throws Exception{
        Scanner name= new Scanner(System.in);
        System.out.print("Username: ");
        String userName= name.nextLine();
        System.out.println("Your name is: " + userName);
        System.out.print("Age: ");
        String Age= name.nextLine();
        System.out.println("Your Age is: " + Age);

        name.close();

    };

}