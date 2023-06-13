package Clase6;

import java.util.Scanner;

public class ParOImpar {
    public static void main(String[] args) {
        //Mostrar si un número es par o impar
        Scanner cargarDatos = new Scanner(System.in);
        System.out.println("Cargue un número");
        int numero = cargarDatos.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Es par");
        } else{
            System.out.println("Es impar");
        }
        }
}
