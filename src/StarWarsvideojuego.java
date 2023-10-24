import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class StarWarsvideojuego {
    public static void main(String[] args) throws Exception {
        /*CREACIÓN DE VARIABLES */
        final String titulo = """
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
        
        final int s1 = new Random().nextInt(1,10), s2  = new Random().nextInt(20,30);
        final int p1 = new Random().nextInt(1,7), p2 = new Random().nextInt(8,12);
        final double n3 = (int)Math.floor(new Random().nextInt(50,100))/10; int  p = new Random().nextInt(10,100);
        final int m = new Random().nextInt(1,5), s = new Random().nextInt(1,5);
        Scanner tecladoScanner = new Scanner(System.in);
        String respuesta;
        int sol_usuario = 0, sol_cpu = 0;
        /*FIN DE LA CREACIÓN DE VARIABLES  */

        //COMIENZA EL JUEGO
        System.out.println(titulo);
        respuesta = tecladoScanner.nextLine();

        if(respuesta.isBlank()){
            //Nivel 1
            System.out.println("NIVEL 1");           
            System.out.println(nivel1);
            System.out.println("s1: " + s1);
            System.out.println("s2: " + s2);
            
            for(int i = s1; i<=s2; i++){
                //bucle que sirve para sumar todos los numeros hasta el límite indicado ej: 1 y 5 = 1+2+3+4+5 = 15
                 sol_cpu+= i;
            }
            System.out.println("Cpu: " + sol_cpu);//la solucón del nivel
            System.out.println("Escriba la solución: ");
            sol_usuario = tecladoScanner.nextInt();

                if(sol_cpu==sol_usuario){
                    //Nivel 2
                    System.out.println("NIVEL 2");
                    System.out.println(nivel2);
                    System.out.println("p1: " + p1);
                    System.out.println("p2: " + p2);
                    sol_cpu=1;
 
                    for(int i = p1; i <= p2; i++){
                        /*bucle que sirve para multiplicar todos los numeros hasta el límite indicado 
                        ej 1 y 3 = 1*2*3 = 6*/
                        sol_cpu *= i;
                    }
                    System.out.println("Test " + sol_cpu);
                    System.out.println("Escriba la solución");
                    sol_usuario = tecladoScanner.nextInt();
                    
                        if(sol_cpu==sol_usuario){
                            //Nivel 3
                            System.out.println("NIVEL 3");
                            System.out.println(nivel3);
                            sol_cpu =1;
                            System.out.println("n3 " + (int) n3);

                            for(int i = 1; i <= n3;i++){
                                //bucle que sirve para multiplicar todos los numeros desde el 1 hasta el indicado
                                sol_cpu *= i;
                            }
                            System.out.println("Test " + sol_cpu);
                            System.out.println("Dime la solución: ");
                            sol_usuario = tecladoScanner.nextInt();

                                if(sol_cpu==sol_usuario){
                                    //Nivel4
                                    System.out.println("NIVEL 4");
                                    System.out.println(nivel4);
                                    sol_cpu=1;
                                    System.out.println("p " +p);

                                    for(int i = 2; i < p; i++){
                                        //bucle que reccorera numero por numero si es divisible entre p
                                        if(p % i == 0){
                                            sol_cpu = 0;
                                            
                                        }
                                    } 
                                    System.out.println("TEST " + sol_cpu);
                                    System.out.println("Es primo?");
                                    sol_usuario = tecladoScanner.nextInt();

                                        if((sol_cpu== 0 && sol_usuario==0) || (sol_usuario ==1 && sol_usuario==1)){
                                            //NIVEL 5
                                            System.out.println(nivel5);
                                            System.out.println("m " + m );
                                            System.out.println("s " + s);
                                            sol_cpu = 0;
                                            int aux1 = 1, aux2 = 1; // creamos dos variables aux para luego sumarlas

                                            for(int i = 1; i<=m ; i++) aux1*=i;
                                            for(int i = 1; i<=s ; i++) aux2*=i;

                                            sol_cpu = aux1 + aux2;
                                            System.out.println("TEST " + sol_cpu);
                                            System.out.println("Dime la solución: ");
                                            sol_usuario = tecladoScanner.nextInt();

                                                if(sol_cpu==sol_usuario){
                                                    System.out.println(ganar);
                                                    System.out.println(fin);
                                                }else{
                                                    System.out.println(ganar);
                                                    System.out.println(fin);
                                                }
                                            
                                        }else System.out.println(perder);

                                }else System.out.println(perder);

                        }else System.out.println(perder);

                }else System.out.println(perder);


        
        }else System.out.println("Reinicia el juego y por favor haz caso de las istrucciones.");
        tecladoScanner.close();
    }
}
