import java.util.Scanner;
import Helpers.AgeHelper;

public class DecirtuEdad{
    public static void main (String []args) throws Exception {
        AgeHelper ageHelper = new AgeHelper();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tell me your age: ");
        int userAge  = scanner.nextInt();

        String ageMessage = ageHelper.IsAdult(userAge);

        System.out.println(ageMessage);
       
    scanner.close();
 }
 }
