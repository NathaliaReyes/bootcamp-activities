package Clase6;

import java.util.Scanner;
public class PiedraPapelTijera {
    //Escribe un programa que permita al usuario jugar el juego clásico de "piedra, papel, tijeras"
    // contra la computadora. El programa debe solicitar al usuario que ingrese su elección (piedra, papel o tijeras)
    // y luego generar una elección aleatoria para la computadora.
    // Después de eso, el programa debe determinar el ganador según las reglas del juego y mostrar el resultado.

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String jugador;
            String computadora;

            System.out.println("Bienvenido/a al jueguito de Piedra, Papel o Tijera!");
            System.out.println();
            System.out.println("Ingrese su elección (piedra, papel o tijera):");
            jugador = scanner.nextLine().toLowerCase();

            // Generar la elección de la computadora de forma aleatoria
            int numeroAleatorio = (int) (Math.random() * 3); // Genera un número aleatorio entre 0 y 2

            if (numeroAleatorio == 0) {
                computadora = "piedra";
            } else if (numeroAleatorio == 1) {
                computadora = "papel";
            } else {
                computadora = "tijera";
            }

            System.out.println("La elección de la computadora es: " + computadora);

            // Determinar el ganador
            if (jugador.equals(computadora)) {
                System.out.println("Es un empate.");
            } else if (jugador.equals("piedra")) {
                if (computadora.equals("papel")) {
                    System.out.println("La computadora gana.");
                } else {
                    System.out.println("¡Felicitaciones! Ganaste.");
                }
            } else if (jugador.equals("papel")) {
                if (computadora.equals("tijera")) {
                    System.out.println("La computadora gana.");
                } else {
                    System.out.println("¡Felicitaciones! Ganaste.");
                }
            } else if (jugador.equals("tijera")) {
                if (computadora.equals("piedra")) {
                    System.out.println("La computadora gana.");
                } else {
                    System.out.println("¡Felicitaciones! Ganaste.");
                }
            } else {
                System.out.println("Elección inválida. Por favor, ingrese piedra, papel o tijera.");
            }

            scanner.close();
        }
    }
