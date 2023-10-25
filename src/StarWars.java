import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
public class StarWarsmejorado {
    public static void main(String[] args)throws Exception{
        TextoJuego texto = new TextoJuego();
        Scanner sc = new Scanner(System.in);

        System.out.println(texto.inicio);
        String avanza = sc.nextLine();
        boolean siguiente = false;
        if(avanza.isBlank()){

            siguiente = Nivel1(sc,texto);
            if(siguiente){
                siguiente = Nivel2(sc,texto);
                if(siguiente){
                    siguiente = Nivel3(sc,texto);
                    if(siguiente){
                        siguiente = Nivel4(sc,texto);
                        if(siguiente){
                             siguiente = Nivel5(sc,texto);

                        }

                    }
                }
            }
        }sc.close();

    }

    private static boolean Nivel1(Scanner sc, TextoJuego texto){
        boolean correcto = false, repetir = true;
        final int s1 = new Random().nextInt(1,10), s2  = new Random().nextInt(20,30);
        int sum = 0, yo = 0;
        System.out.println("NIVEL 1");
        System.out.println(texto.nivel1);
        System.out.println("S1: "+s1 );
        System.out.println("S2: "+s2 );

        for(int i = s1; i<=s2; i++){
            sum+=i;
        }
        do {
            System.out.println("Test: " +sum);
            System.out.println("Dime la solución: ");
            try {
                yo = sc.nextInt();
                repetir = false;
            } catch (Exception e) {
                sc.nextLine();
                System.out.println("Introduzca un número por favor: ");
            }
        }while(repetir);

        if(yo==sum){
            correcto = true;
        }else System.out.println(texto.perder);
        return correcto;
    }

    private static boolean Nivel2(Scanner sc, TextoJuego texto){
        boolean correcto = false,repetir = true;
        final int p1 = new Random().nextInt(1,7), p2 = new Random().nextInt(8,12);
        int sum = 1, yo = 0;
        System.out.println("NIVEL 2");
        System.out.println(texto.nivel2);
        System.out.println("P1: "+p1 );
        System.out.println("P2: "+p2 );

        for(int i = p1; i<=p2; i++){
            sum*=i;
        }
        do{
        System.out.println("Test: " +sum);
        System.out.println("Dime la solución: ");
        try{yo = sc.nextInt();
        repetir = false;}catch (Exception e){
            sc.nextLine();
            System.out.println("Por favor introduzca un numero");
        }}
        while(repetir);

        if(yo==sum){
            correcto = true;
        }else System.out.println(texto.perder);
        return correcto;
    }

    private static boolean Nivel3(Scanner sc, TextoJuego texto){
        boolean correcto = false, repetir =true;
        final double n3 = (int)Math.floor(new Random().nextInt(50,100))/10;
        int sum = 1, yo = 0;
        System.out.println("NIVEL 3");
        System.out.println(texto.nivel3);
        System.out.println("N3: "+(int)n3 );

        for(int i = 1; i<=n3;i++){
            sum*=i;
        }
        do{System.out.println("Test: " +sum);
        System.out.println("Dime la solución: ");
        try{yo = sc.nextInt();repetir = false;}catch (Exception e){
            sc.nextLine();
            System.out.println("Introduzca un numero.");
        }}
        while(repetir);

        if(yo==sum){
            correcto = true;
        }else System.out.println(texto.perder);
        return correcto;
    }

    private static boolean Nivel4(Scanner sc, TextoJuego texto){
        boolean correcto = false, repetir = true;
        int  p = new Random().nextInt(10,100);
        int sum = 1, yo = 0;
        System.out.println("NIVEL 4");
        System.out.println(texto.nivel4);
        System.out.println("P: "+p );

        for(int i = 2; i<p; i++){
           if(p%i==0)sum=0;
        }
        do{System.out.println("Test: " +sum);
        System.out.println("Dime la solución: ");
        try{yo = sc.nextInt();repetir = false;}catch (Exception e){
            sc.nextLine();
            System.out.println("porfavor introduzca un numero.");
        }}
        while(repetir);

        if(yo==sum){
            correcto = true;
        }else System.out.println(texto.perder);
        return correcto;
    }

    private static boolean Nivel5(Scanner sc, TextoJuego texto){
        boolean correcto = false;
        final int m = new Random().nextInt(1,5), s = new Random().nextInt(1,5);
        int sum = 0, yo = 0,aux1 =1 ,aux2=1;
        System.out.println("NIVEL 5");
        System.out.println(texto.nivel5);
        System.out.println("M: "+m);
        System.out.println("S: "+s );

        for(int i = 1; i<=m; i++){
            aux1*=i;
        }
        for(int i = 1; i<=s; i++){
           aux2*=i;
        }sum=aux1+aux2;

        System.out.println("Test: " +sum);
        System.out.println("Dime la solución: ");
        yo = sc.nextInt();

        if(yo==sum){
            correcto = true;
            System.out.println(texto.ganar);
            System.out.println(texto.fin);

        }else System.out.println(texto.perder);
        return correcto;
    }
}
class TextoJuego{
    final String inicio = """
            === STAR WARS CÓDIGOS SECRETOS ===
            Hace mucho tiempo, en una galaxia muy, muy lejana… La Princesa Leia, Luke
            Skywalker, Han Solo, Chewbacca, C3PO y R2D2 viajan en una nave imperial robada
            en una misión secreta para infiltrarse en otra estrella de la muerte que el imperio
            está construyendo para destruirla. (Presiona Intro para continuar)
                """;
    final String nivel1 = """
            Los problemas empiezan cuando deben realizar un salto hiperespacial hasta al
            sistema S1 en el sector S2, pero el sistema de navegación está estropeado y el
            computador tiene problemas para calcular parte de las coordenadas de salto.
            Chewbacca, piloto experto, se da cuenta que falta el cuarto número de la serie.
            Recuerda de sus tiempos en la academia de pilotos que para calcularlo hay que
            calcular el sumatorio entre el nº del sistema y el nº del sector (ambos inclusive).
            ¿Qué debe introducir?
                """;

    final String nivel2 = """
            Gracias a Chewbacca consiguen llegar al sistema correcto y ven a lo lejos la estrella
            de la muerte. Como van en una nave imperial robada se aproximan lentamente con
            la intención de pasar desapercibidos. De repente suena el comunicador. “Aquí
            agente de espaciopuerto P1 contactando con nave imperial P2. No están destinados
            en este sector. ¿Qué hacen aquí?”. Han Solo coge el comunicador e improvisa. “Eh…
            tenemos un fallo en el… eh… condensador de fluzo... Solicitamos permiso para
            atracar y reparar la nave”. El agente, que no se anda con tonterías, responde
            “Proporcione código de acceso o abriremos fuego”. Han Solo ojea rápidamente el
            manual del piloto que estaba en la guantera y da con la página correcta. El código
            es el productorio entre el nº del agente y el nº de la nave (ambos inclusive).
            ¿Cuál es el código?
                """;
    final String nivel3 = """
            Han Solo proporciona el código correcto. Atracan en la estrella de la muerte, se
            equipan con trajes de soldados imperiales que encuentran en la nave para pasar
            desapercibidos y bajan. Ahora deben averiguar en qué nivel de los N existentes se
            encuentra el reactor principal. Se dirigen al primer panel computerizado que
            encuentran y la Princesa Leia intenta acceder a los planos de la nave pero necesita
            introducir una clave de acceso. Entonces recuerda la información que le proporcionó
            Lando Calrissian “La clave de acceso a los planos de la nave es el factorial de N/10
            (redondeando N hacia abajo), donde N es el nº de niveles”.
            ¿Cual es el nivel correcto?
                """;
    final String nivel4 = """
            Gracias a la inteligencia de Leia llegan al nivel correcto y encuentran la puerta
            acorazada que da al reactor principal. R2D2 se conecta al panel de acceso para
            intentar hackear el sistema y abrir la puerta. Para desencriptar la clave necesita
            verificar si el número P es primo o no. Si es primo introduce un 1, si no lo es
            introduce un 0.
                """;
    final String nivel5 ="""
            Consiguen entrar al reactor. Ya solo queda que Luke Skywalker coloque la bomba,
            programe el temporizador y salir de allí corriendo. Necesita programarlo para que
            explote en exactamente M minutos y S segundos, el tiempo suficiente para escapar
            antes de que explote pero sin que el sistema de seguridad anti-explosivos detecte y
            desactive la bomba. Pero el temporizador utiliza un reloj Zordgiano un tanto
            peculiar. Para convertir los minutos y segundos al sistema Zordgiano hay que sumar
            el factorial de M y el factorial de S. ¿Qué valor debe introducir?
                """;
    final String ganar = """
            Luke Skywalker introduce el tiempo correcto, activa el temporizador y empiezan a
            sonar las alarmas. Salen de allí corriendo, no hay tiempo que perder. La nave se
            convierte en un hervidero de soldados de arriba a abajo y entre el caos que les rodea
            consiguen llegar a la nave y salir de allí a toda prisa. A medida que se alejan
            observan por la ventana la imagen de la colosal estrella de la muerte explotando en
            el silencio del espacio, desapareciendo para siempre junto a los restos del malvado
            imperio.
            ¡Has salvado la galaxia gracias a la Fuerza Jedi de las matemáticas! Enhorabuena ;D
                """;
    final String perder = """
            Ese no era el código correcto… La misión ha sido un fracaso… :( :( :(
                Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!
                """;
    final String fin = """
            Gracias por jugar :D
                """;
}
