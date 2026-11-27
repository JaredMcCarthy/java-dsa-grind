
package Ejercicios3;

import java.util.Scanner;

public class problema3_3 {
    public static void main(String[] args) {

        Scanner scaner  = new Scanner(System.in);

        System.out.println("Tamaño lado uno: ");
        int lado1 = scaner.nextInt();

        System.out.println("Tamaño lado dos: ");
        int lado2 = scaner.nextInt();

        System.out.println("Tamaño lado tres: ");
        int lado3 = scaner.nextInt();

        if (lado1 == lado2 && lado2 == lado3 && lado3 == lado1) {
            System.out.println(lado1 + " " + lado2 + " " + lado3 + " -> Equilatero.");
        } else if (( lado1 == lado2 && lado1 != lado3) || ( lado1 == lado3 && lado1 != lado2) || (lado2 == lado3 && lado2 != lado1)) {
            System.out.println(lado1 + " " + lado2 + " " + lado3 + " -> Isosceles");
        } else if ( (lado1 != lado2) || (lado1 != lado3) || (lado3 != lado2) ) {
            System.out.println(lado1 + " " + lado2 + " " + lado3 + " -> Escaleno.");
        } else{
            System.out.println(lado1 + " " + lado2 + " " + lado3 + " -> No forma un triangulo.");
        }
    }
}