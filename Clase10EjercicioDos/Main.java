package Clase10EjercicioDos;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cuenta cuenta =  new Cuenta();
        cuenta.ingresar();
        cuenta.retirar();
        System.out.println(cuenta);
        System.out.println(" ");



        Persona persona1 = new Persona();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese su Id: ");
        persona1.setId(teclado.nextInt());

        System.out.println("Ingrese su Nombre: ");
        persona1.setNombre(teclado.next());

        System.out.println("Ingrese su Apellido: ");
        persona1.setApellido(teclado.next());

        System.out.println("Ingrese su Edad: ");
        persona1.setEdad(teclado.nextInt());

        System.out.println("Ingrese su fecha de nacimiento de esta forma: (yyyy-mm-dd): ");
        String fechaDeNacimiento = teclado.next();
        persona1.setFechaDeNacimiento(String.valueOf(LocalDate.parse(fechaDeNacimiento)));

        System.out.println("Ingrese su Documento de Identidad: ");
        persona1.setDocumentoDeIdentidad(teclado.nextLong());





        System.out.println(persona1);
        System.out.println("Es mayor de edad? : " + persona1.esMayorDeEdad());
        //pedro.mostrar();


    }



}
