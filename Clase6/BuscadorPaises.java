package Clase6;

import java.util.Scanner;

public class BuscadorPaises {
    public static void main(String[] args){
        //Arma un buscador de países con Google Maps.
        Scanner cargarDatos = new Scanner(System.in);
        System.out.println("Ingresa el nombre de un país");
        String pais = cargarDatos.nextLine();
        String enlace = "https://www.google.com/maps/search/" + pais;
        System.out.println("Enlace para buscar el país en Google Maps " + enlace);
    }
}
