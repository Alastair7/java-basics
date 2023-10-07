import java.util.Scanner;
public class Arrays1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]num= new int[10];
        int pos = 0 , neg = 0;
        double Sumapos = 0, Sumaneg = 0;
        
        for(int i = 0; i<10 ; i++){
            System.out.println("numeros[" + i + "]= ");
            num[i] = sc.nextInt();
        }for(int i = 0; i<10; i++){
            if(num[i]>0){
                Sumapos += num[i];
                pos++;
            }else if(num[i] < 0){
                Sumaneg += num[i];
                neg++;
            }
        }if(pos != 0){
            System.out.println("Media valores positivos: " + Sumapos/pos);
        }else{
            System.out.println("No hay numeros positivos");
        }if(neg != 0){
            System.out.println("Media valores negativos: " + Sumaneg/neg);
        }else{
            System.out.println("No hay numeros negativos.");
        }sc.close();
               
    }
}