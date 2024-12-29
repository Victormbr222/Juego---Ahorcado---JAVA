import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // clase Scanner que sirve para que el usuario escriba un dato de entrada
        Scanner scanner = new Scanner(System.in);

        //Declaraciones y asignaciones
        String palabraSecreta = "cocodrilo";
        int intentosMax = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;


        //Arreglos
        char[] letrasAdivinadas = new char[palabraSecreta.length()];
        // Estructura de control (Bucle For)
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
            System.out.println(letrasAdivinadas[i]);
        }
        while (!palabraAdivinada && intentos < intentosMax){
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas));
            System.out.println("Introduce una letra: ");
            char letra = Character.toLowerCase(scanner.next().charAt(0));
            boolean letraCorrecta = false;

            for (int i = 0; i < palabraSecreta.length(); i++) {
                //Estructura de control condicional
               if(palabraSecreta.charAt(i) == letra){
                   letrasAdivinadas[i] = letra;
                   letraCorrecta = true;
               }
            }
            if (!letraCorrecta){
                intentos++;
                System.out.println("Incorrecto! te quedan " + (intentosMax - intentos) + " intentos");
            }
            if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                palabraAdivinada = true;
                System.out.println("Felicidadees has adivinado la palabra secreta: " + palabraSecreta);
            }
        }
        if (!palabraAdivinada){
            System.out.println("Que pena te has quedado sin intentos");
        }
        scanner.close();
    }
}