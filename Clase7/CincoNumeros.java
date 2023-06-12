package Clase7;

import java.util.Scanner;

public class CincoNumeros {
    public static void main(String [] args){
        // Hacer un programa que permita al usuario ingresar 5 números y mostrarlos.
        // Agregar que muestre el número mayor y el número menor.
        // Mostrar el promedio.

        int[] numeros = new int[5];
        Scanner teclado = new Scanner(System.in);


        for (int contador = 0; contador < numeros.length; contador++){
            System.out.println("Ingrese un número: ");
            int numero = teclado.nextInt();
            numeros[contador] = numero;
        }
        System.out.println("Los números que usted ingresó, son: ");
        for (int contador = 0; contador < numeros.length; contador++){
            System.out.print(numeros[contador]);
        }

        int mayor = 0;
        int menor = 0;
        for (int contador = 0; contador < numeros.length; contador++){
            int num = numeros[contador];
            if(num >= mayor ||  contador == 0){
                mayor = num;
            }
            if(num <= menor ||  contador == 0){
                menor = num;
            }
        }
        System.out.println(" ");
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);

        int sumatoria = 0;
        for(int contador = 0; contador < numeros.length; contador++){
            int num = numeros[contador];
            sumatoria += num;
        }
        System.out.println("La sumatoria es: " + sumatoria);
        float promedio = (float) sumatoria / numeros.length;
        System.out.println("El promedio es :" + promedio);
    }
}
