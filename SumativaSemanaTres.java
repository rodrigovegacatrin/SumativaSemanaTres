import java.util.Scanner;  // Importa la clase Scanner para leer la entrada del usuario desde la consola

public class SumativaSemanaTres {  // Declaración de la clase principal del programa
    public static void main(String[] args) {  // Método principal donde comienza la ejecución del programa
        Scanner scanner = new Scanner(System.in);  // Crea un objeto Scanner para capturar la entrada del usuario

        // Solicitar y capturar la marca del vehículo
        System.out.print("Ingrese la marca: ");  // Muestra un mensaje en la consola pidiendo la marca
        String marca = scanner.nextLine();  // Captura la marca ingresada por el usuario y la almacena en la variable 'marca'

        // Solicitar y capturar el modelo del vehículo
        System.out.print("Ingrese el modelo: ");  // Muestra un mensaje en la consola pidiendo el modelo
        String modelo = scanner.nextLine();  // Captura el modelo ingresado por el usuario y lo almacena en la variable 'modelo'

        // Solicitar y capturar la cilindrada del vehículo
        System.out.print("Ingrese la cilindrada: ");  // Muestra un mensaje en la consola pidiendo la cilindrada
        String cilindrada = scanner.nextLine();  // Captura la cilindrada ingresada por el usuario y la almacena en la variable 'cilindrada'

        // Solicitar y capturar el tipo de combustible del vehículo
        System.out.print("Ingrese el tipo de combustible: ");  // Muestra un mensaje en la consola pidiendo el tipo de combustible
        String combustible = scanner.nextLine();  // Captura el tipo de combustible ingresado por el usuario y lo almacena en la variable 'combustible'

        // Solicitar y capturar la capacidad en pasajeros del vehículo
        System.out.print("Ingrese la capacidad en pasajeros: ");  // Muestra un mensaje en la consola pidiendo la capacidad en pasajeros
        int capacidad = scanner.nextInt();  // Captura la capacidad ingresada por el usuario y la almacena en la variable 'capacidad'

        // Mostrar los datos ingresados por el usuario
        System.out.println("La marca que ha ingresado es: " + marca);  // Muestra en la consola la marca ingresada por el usuario
        System.out.println("El modelo que ha ingresado es: " + modelo);  // Muestra en la consola el modelo ingresado por el usuario
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada);  // Muestra en la consola la cilindrada ingresada por el usuario
        System.out.println("El tipo de combustible es: " + combustible);  // Muestra en la consola el tipo de combustible ingresado por el usuario
        System.out.println("Tiene una capacidad de " + capacidad + " pasajeros.");  // Muestra en la consola la capacidad en pasajeros ingresada por el usuario
        System.out.println("Que tenga un buen día.");  // Mensaje final para el usuario
    }
}