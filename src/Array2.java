import java.util.Scanner;
public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[10];
        double media = 0;
        for(int i = 0; i < 10; i++){
            System.out.print("numero[" + i + "]= ");
            num[i] = sc.nextInt();
        }for(int i = 0; i < 10; i++){
            if( i % 2==0){
                media = media + num[i];
            }
        }
        System.out.print("La media es: " + (media/5));
        sc.close();
    }
}
