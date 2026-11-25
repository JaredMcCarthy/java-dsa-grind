package Ejercicios2;

import java.util.Scanner;

public class problema2_3 {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Ingrese primer numero: ");
        int pn = scanner.nextInt();

        System.out.printf("Ingrese segundo numero: ");
        int sn = scanner.nextInt();

        System.out.printf("Ingrese tercer numero: ");
        int tn = scanner.nextInt();

        if (pn > sn && pn > tn) {
            System.out.print("El mayor es: " + pn);
        } else if (sn > pn && sn > tn) {
            System.out.print("El mayor es: " + sn);
        } else if (tn > pn && tn > sn) {
            System.out.print("El mayor es: " + tn);
        } else {
            System.out.print("Son iguales todos.");
        }

    }
}
