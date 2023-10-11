
import java.util.Random;
import java.util.Scanner;
public class BattleShip {
    public static void main(String[] args) {
        int coordenada;
        Barco jugador1 = new Barco();
        Barco jugador2 = new Barco();

        Mapa mapa = new Mapa();
        Scanner sc = new Scanner(System.in);

        System.out.println("Nombre Jugador: ");
        jugador1.nombre_barco = sc.nextLine(); 

        System.out.println("Nombre Oponente: ");
        jugador2.nombre_barco = sc.nextLine();

        jugador1.posición = mapa.GetRandomPosition();
        jugador2.posición = mapa.GetRandomPosition();

        do{
            System.out.print(jugador1.nombre_barco  + " Es tu turno: ");
            coordenada = sc.nextInt();

            if(coordenada  ==  jugador2.posición){
                System.out.println("\"IMPACTO!\", el barco se ha hundido.");
                jugador1.win = true;
                break;
            }

            System.out.print(jugador2.nombre_barco  + " Es tu turno: ");
            coordenada = sc.nextInt();

            if(coordenada == jugador1.posición){
                System.out.println("\"IMPACTO!\", el barco se ha hundido.");
                jugador2.win = true;
                break;
            }
        }while(!jugador1.win || !jugador2.win);
        if (jugador1.win){
            System.out.println("El jugador  " + jugador1.nombre_barco + " ha ganado.");
            System.out.print("El jugador " + jugador2.nombre_barco + " ha perdido.");
        }
        if(jugador2.win){
            System.out.println("El jugador " + jugador2.nombre_barco + " ha ganado.");
            System.out.print("El jugador " + jugador1.nombre_barco + " ha perdido.");
        }
        sc.close();

        }
    }
class Mapa {
final String mapa[] = {"A1","A2","A3","A4","A5","A6","A7","A8","A9","A10","B1","B2","B3","B4","B5","B6","B7","B8","B9","B10","C1","C2","C3","C4","C5","C6","C7","C8","C9","C10","D1","D2","D3","D4","D5","D6","D7","D8","D9","D10","E1","E2","E3","E4","E5","E6","E7","E8","E9","E10","F1","F2","F3","F4","F5","F6","F7","F8","F9","F10","G1","G2","G3","G4","G5","G6","G7","G8","G9","G10","H1","H2","H3","H4","H5","H6","H7","H8","H9","H10","I1","I2","I3","I4","I5","I6","I7","I8","I9","I10","J1","J2","J3","J4","J5","J6","J7","J8","J9","J10"};

public int GetRandomPosition() {
    return new Random().nextInt(mapa.length);
}
}
class Barco{
    
    String nombre_barco; 
    int posición;
    boolean win = false;
}







