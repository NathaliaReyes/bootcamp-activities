import java.util.Random;
import java.util.Scanner;

public class Clase5 {
    public static void main(String[] Args){
        //Juego de adivinar el número:
        //Genera un número aleatorio entre 1 y 100. Pídele al usuario que adivine el número.
                Random random = new Random();
                int randomNumber = random.nextInt(101); // se genera un número random entre 0-100
                int intentos = 0;

                Scanner scanner = new Scanner(System.in);
                System.out.println("Adivina un número random entre 0 y 100!");

                while (true) {
                    System.out.print("Digita tu número: ");
                    int guess = scanner.nextInt();
                    intentos++;

                    if (guess < randomNumber) {
                        System.out.println("Muy bajito! Intenta de nuevo.");
                    } else if (guess > randomNumber) {
                        System.out.println("Muy alto! Intenta de nuevo.");
                    } else {
                        System.out.println("Felicitaciones! Adivinaste el número en " + intentos + " intentos.");
                        break;
                    }
                }
                scanner.close();
            }
        }
