import java.util.Scanner;

public class DecirtuEdad{
    public static void main (String []args) throws Exception {
        Scanner Age = new Scanner(System.in);
        System.out.print("Tell me your age: ");
        int Age2  = Age.nextInt();
        Comprobacion(Age2);
       
    Age.close();
 }
 private static boolean VerdadMentira(int age3) {
    return age3 > 18;

 }
 private static void Comprobacion(int age4){

    boolean isAdult=VerdadMentira(age4);
    
        if (!isAdult) {
            System.out.println("Your age is: "+ age4 );
            System.out.println("You are a minor");
        }else{
            System.out.println("You are not a minor and your age is: "+ age4);
        }


 }
}