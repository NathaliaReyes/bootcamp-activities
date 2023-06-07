import java.util.Scanner;

public class Clase5 {
    public static void main(String[] Args){
        //Calculadora de edad de perros:
        //Pídele al usuario que ingrese la edad de su perro.
        //Convierte esa edad a años de perro (se dice que 1 año humano equivale a 7 años de perro).

        Scanner cargarDatos = new Scanner(System.in);
        System.out.println("Ingrese la edad de su perro (en años)");
        int edadPerro = cargarDatos.nextInt();
        int edadConvertida = (edadPerro * 7);
        System.out.println("La edad convertida a años perro es :" + edadConvertida + " años");

    }
}
