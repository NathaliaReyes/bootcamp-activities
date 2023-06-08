package Clase5;

import java.util.Scanner;

public class Propina {
    public static void main(String[] Args){
        //4) Calculadora de propinas:
        //Pídele al usuario que ingrese el total de la cuenta en un restaurante.
        //Pídele al usuario que ingrese el porcentaje de propina que desea dejar.
        //Calcula el monto de la propina utilizando la fórmula: propina = totalCuenta * (porcentajePropina / 100).

        Scanner cargarDatos = new Scanner(System.in);
        System.out.println("Ingrese el total consumido el día de hoy");
        double totalConsumido = cargarDatos.nextDouble();
        System.out.println("Ingrese el porcentaje de propina que desea dejar");
        double porcentajePropina = cargarDatos.nextInt();
        double propina = totalConsumido * (porcentajePropina / 100);
        System.out.println("La propina que desea dejar es de :" + propina + " dólares");
        System.out.println("Gracias por visitarnos, vuelva pronto!");
    }
}
