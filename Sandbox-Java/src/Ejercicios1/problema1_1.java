package Ejercicios1;
//PRESENTACION
import java.util.Scanner;

public class problema1_1 {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Ingrese su nombre: ");
        String nombre = scanner.nextLine(); //nextline lee nombre y apellido osea todo

        System.out.printf("Ingrese su edad: ");
        int edad = scanner.nextInt();

        System.out.printf("Ingrese su ciudad: ");
        String ciudad = scanner.next();

         int edad_sig = edad + 1;

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " (El año que viene: " + edad_sig + ")");
        System.out.println("Ciudad: " + ciudad);

    }
}




