package Ejercicios1;

import java.util.Scanner;

public class problema1_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese los grados °C: ");
        double C = scanner.nextDouble();

        double conversion = (C * 9.0 / 5.0) + 32;

        System.out.printf("%.2f °C = %.2f °F", C, conversion); //no te confundas, donde van %.2f van las dos variables.
    }
}