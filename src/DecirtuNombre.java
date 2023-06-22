import java.util.Scanner;

public class DecirtuNombre{
    public static void main (String []args) throws Exception {
        Scanner Age = new Scanner(System.in);
        System.out.print("Tell me your age: ");
        int Age2  = Age.nextInt();
        if (Age2<18) {
            System.out.println("Your age is: "+ Age2 );
            System.out.println("You are a minor");
        }else{
            System.out.println("You are not a minor and your age is: "+ Age2);
        }
    Age.close();
 }
}