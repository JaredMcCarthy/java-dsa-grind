package Ejercicios2;

import java.util.Scanner;

public class problema2_2 {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Ingrese un año: ");
        int anio = scanner.nextInt();

        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 100 == 0 && anio % 400 == 0)){
            System.out.println(anio + " -> Es bisiesto.");
        } else {
            System.out.println(anio + " -> No es bisiesto.");
        }
    }
}

//Fuentes del codigo para ejemplo:
//https://discoduroderoer.es/como-calcular-si-un-ano-es-bisiesto-en-java/