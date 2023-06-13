package Clase6;

import java.util.Scanner;

public class LlamarViaWhatsApp {
    public static void main(String[] args){
        //Armar un programa que permita llamar a una persona por Whatsapp.
        Scanner cargarDatos = new Scanner(System.in);
        System.out.println("Ingrese un número de teléfono sin espacios");
        String telefono = cargarDatos.nextLine();
        String enlace = "https://api.whatsapp.com/send?phone=" +telefono;
        System.out.println("Este es el link para comunicarte con esa persona: "+enlace);
    }
}
