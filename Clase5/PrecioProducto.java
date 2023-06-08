package Clase5;

import java.util.Scanner;
public class PrecioProducto {
    public static void main(String[] Args){
        //Calculadora de descuento:
        //Pídele al usuario que ingrese el precio original de un producto.
        //Pídele al usuario que ingrese el porcentaje de descuento.
        //Calcula el precio final después de aplicar el descuento utilizando la fórmula: precioFinal = precioOriginal - (precioOriginal * descuento / 100).
        //Muestra el precio final al usuario.
        //Vamos a manejar todos los precios en dólares.

        Scanner cargarDatos = new Scanner(System.in);
        System.out.println("Bienvenid@s a nuestra tienda virtual! :)");
        System.out.println("Ingrese el precio original del producto (en dólares)");
        int precioProducto = cargarDatos.nextInt();
        System.out.println("Ingrese el porcentaje de descuento aplicado a ese producto");
        double porcentajeDescuento = cargarDatos.nextDouble();
        double precioFinal = precioProducto - (precioProducto * porcentajeDescuento / 100);
        System.out.println("El precio final del producto que seleccionó es: " + precioFinal + " dólares");
    }
}
