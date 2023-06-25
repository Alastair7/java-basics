import java.util.Scanner;
public class Colores {

    public static void main(String[] args) throws Exception{
        Scanner colorofrainbow = new Scanner(System.in);
        System.out.print("Tell me a color of the rainbow: ");
        String  color = colorofrainbow.nextLine();
        switch(color){
            case "red": 
            System.out.println("The color is "+ color);
            break;
            case "orange":
            System.out.println("The color is "+ color);
            break;
            case "yellow":
            System.out.println("The color is "+ color);
            break;
            case "green":
            System.out.println("The color is "+ color);
            break;
            case "indigo":
            System.out.println("The color is "+color);
            break;
            case "blue":
            System.out.println("The color is "+ color);
            break;
            case "purple":
            System.out.println("The color is "+color);
            break;
            default:
            System.out.println("The color doesnt exist");
        }
        colorofrainbow.close();

    }
    
}
