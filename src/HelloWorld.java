import java.util.Scanner;

public class HelloWorld {
    public static void main(String []args) throws Exception{
        Scanner scannerName = new Scanner(System.in);

        System.out.print("Type your name: ");
        String userName= scannerName.nextLine();
        System.out.println("Hi, your name is: " + userName);

        scannerName.close();
    }
}