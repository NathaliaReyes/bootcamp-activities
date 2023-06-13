package Clase6;

import java.util.Scanner;

public class BuscadorTwitter {
    public static void main(String[] args){
        //Arma un buscador de tweets para Twitter.com
        Scanner cargarDatos = new Scanner(System.in);
        System.out.println("Ingrese el nombre de una celebridad (de una sola palabra), por ejemplo: “Messi”");
        String cuenta = cargarDatos.nextLine();
        String enlace = "https://twitter.com/search?q=" + cuenta;
        System.out.println("La cuenta de twitter de la celebridad que está buscando es:" + enlace);
    }


}
