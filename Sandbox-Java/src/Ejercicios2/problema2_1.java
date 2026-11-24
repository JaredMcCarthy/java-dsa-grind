package Ejercicios2;

import java.util.Scanner;

public class problema2_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner((System.in));

        System.out.printf("Ingrese primer numero: ");
        int pn = scanner.nextInt();

        if (pn == 0) {
            System.out.println(pn + " Es cero. ");
        } else {
            String numero = (pn > 0) ? "Positivo" : "Negativo"; //nueva manera de condiciones

            String paridad = (pn % 2 == 0) ? "Par" : "Impar";

            System.out.println(pn + " " + " -> " + numero + " " + paridad);
        }

    }
}

