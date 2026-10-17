
import java.util.Scanner;

public class Ejercicio5 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del vector: ");
        int n = scanner.nextInt(); //LO GUARDAMOS EN ESA N

        int[] vector = new int[n]; //este es el vector de tamano n OSEA EL USUARIO DECIDE EL TAMANO

        for(int i = 0; i < vector.length; i++){
            System.out.println("Ingrese un numero: ");
            vector[i] = scanner.nextInt();
        }

        int suma = 0;

        for (int i = 0; i < vector.length; i++){
            suma += vector[i];
        }

        System.out.println("La suma total es: " + suma);

    }
}