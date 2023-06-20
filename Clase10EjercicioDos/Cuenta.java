package Clase10EjercicioDos;

import java.util.Scanner;

public class Cuenta {

    private float cantidad;

    public Cuenta() {
    }

    @Override
    public String toString() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre del titular de la cuenta: ");
        String titular = teclado.nextLine();
        return "Clase10EjercicioDos.Cuenta{" +
                "\n titular = '" + titular + '\'' +
                ",\n Saldo actual en su cuenta = $" + cantidad +
                '}';
    }

    public void ingresar(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad a ingresar: ");
        float cantidadIntroducida = teclado.nextFloat();
        if(cantidadIntroducida > 0){
            cantidad += cantidadIntroducida;
        }
    }

    public void retirar(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad a retirar");
        cantidad -= teclado.nextFloat();
    }
}
