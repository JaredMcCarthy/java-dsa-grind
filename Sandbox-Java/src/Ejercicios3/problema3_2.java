package Ejercicios3;

import java.util.Scanner;

public class problema3_2 {
    public void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un caracter: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese un segundo caracter: ");
        int numero2 = scanner.nextInt();

        System.out.print("Que desea ejecutar +, -, *, /:  ");
        char digito = scanner.next().charAt(0);

        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        double division = (double) numero1 / numero2;
        int multiplicacion = numero1 * numero2;

        switch (digito) {
            case '+':
                System.out.println((numero1 + digito +  numero2 + " -> " + suma));
                break;
            case '-':
                System.out.println((numero1 + digito +  numero2 + " -> " + resta));
                break;
            case '*':
                System.out.println((numero1 + digito +  numero2 + " -> " + multiplicacion));
                break;
            case '/':
                System.out.println((numero1 + digito +  numero2 + " -> " + division));
                break;
            default:
                System.out.print("Error: no se puede dividir entre 0.");
    }
    }
}
