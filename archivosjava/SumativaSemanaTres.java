import java.util.Scanner;

public class SumativaSemanaTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Datos de entrada
        System.out.print("Ingrese la marca: ");
        String marca = scanner.nextLine();

        System.out.print("Ingrese el modelo: ");
        String modelo = scanner.nextLine();

        System.out.print("Ingrese la cilindrada: ");
        String cilindrada = scanner.nextLine();

        System.out.print("Ingrese el tipo de combustible: ");
        String combustible = scanner.nextLine();

        System.out.print("Ingrese la capacidad en pasajeros: ");
        int capacidad = scanner.nextInt();

        // Datos de salida
        System.out.println("La marca que ha ingresado es: " + marca);
        System.out.println("El modelo que ha ingresado es: " + modelo);
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada);
        System.out.println("El tipo de combustible es: " + combustible);
        System.out.println("Tiene una capacidad de " + capacidad + " pasajeros.");
        System.out.println("Que tenga un buen día.");
    }
}