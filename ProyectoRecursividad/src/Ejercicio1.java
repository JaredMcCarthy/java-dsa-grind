
import java.util.Scanner;

public class Ejercicio1 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero: ");
        int numero = scanner.nextInt();

        scanner.close();
        System.out.println("Su factorial es: " + Factorial(numero));
    }

    public static int Factorial(int numero) {
        if(numero == 0) {
            return 1;
        } else {
            return numero * Factorial(numero - 1);
        }
    }
}


//Pseucodigo
// iniciamos el canner normal
//dentro de la funcion main iniciamos el psvm
// dentro iniciamos otro scanner, pedimos numero, guardamos en variable y cerramos scanner
//ahi mismo mostramos la variable de la funcion donde se calcula el factorial que viene abajio

//funcion dos dentro del mismo main

//iniciamos esta publica estatica y de entero con un parametro del numero
// si es igual a 0
// entonces regresa uno sino me multiplica el parametro por un numero anterior







