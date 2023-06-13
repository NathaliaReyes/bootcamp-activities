package Clase6;

import java.util.Scanner;
public class PromedioTresNumeros {
    public static void main(String[] args) {
        //Cargar 3 números y sacarle el promedio.
        Scanner cargarDatos = new Scanner(System.in);
        System.out.println("Cargue el primer número");
        double numero1 = cargarDatos.nextInt();
        System.out.println("Cargue el segundo número");
        double numero2 = cargarDatos.nextInt();
        System.out.println("Cargue el tercer número");
        double numero3 = cargarDatos.nextInt();
        double promedio =(numero1 + numero2 + numero3) / 3;
        System.out.println("El promedio es: " + promedio);
    }
}
