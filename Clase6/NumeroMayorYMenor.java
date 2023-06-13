package Clase6;

import java.util.Scanner;

public class NumeroMayorYMenor {
    public static void main(String[] args) {
        //Cargar 3 números y mostrar el mayor de ellos.
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cargue el primer número");
        int numero1 = teclado.nextInt();
        System.out.println("Cargue el segundo número");
        int numero2 = teclado.nextInt();
        System.out.println("Cargue el tercer número");
        int numero3 = teclado.nextInt();

        if(numero1 > numero2 && numero1 > numero3){
            System.out.println("El número mayor es: " + numero1);
        }
        if(numero2 > numero1 && numero2 > numero3){
            System.out.println("El número mayor es: " + numero2);
        }
        if(numero3 > numero1 && numero3 > numero2){
            System.out.println("El número mayor es: " + numero3);
        }
        if(numero1 < numero2 && numero1 < numero3){
            System.out.println("El número menor es: " + numero1);
        }
        if(numero2 < numero1 && numero2 < numero3){
            System.out.println("El número menor es: " + numero2);
        }
        if(numero3 < numero1 && numero3 < numero2){
            System.out.println("El número menor es: " + numero3);
        }
    }
}
