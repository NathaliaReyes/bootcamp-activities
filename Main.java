import java.util.Scanner;

public class Main {
    public static void main(String[] Args){
        //Conversor de millas a kilómetros:
        //Pídele al usuario que ingrese una distancia en millas.
        //Convierte la distancia a kilómetros utilizando la fórmula: kilómetros = millas * 1.60934.
        //Muestra la distancia en kilómetros al usuario.

        Scanner cargarDatos = new Scanner(System.in);
        System.out.println("Ingrese una distancia en millas");
        double millas = cargarDatos.nextDouble();
        double distanciaEnKilometros = (millas * 1.60934);
        System.out.println("La distancia en Kilometros es :" + distanciaEnKilometros + " Km");

    }
}
