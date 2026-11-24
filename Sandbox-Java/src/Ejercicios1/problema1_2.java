package Ejercicios1;

import java.util.Scanner;

public class problema1_2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Ingrese el primer numero: ");
        int enteroUno = sc.nextInt();

        System.out.printf("Ingrese el segundo numero: ");
        int enteroDos = sc.nextInt();

        int suma = enteroUno + enteroDos;
        int resta = enteroUno - enteroDos;
        int multiplicacion = enteroUno * enteroDos;
        double resDivision = (double) enteroUno / enteroDos; //para que sea decimales tipo 1.3
        int dividendo = enteroUno % enteroDos; //el residuo es el %

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + resDivision);
        System.out.println("Residuo: " + dividendo);

    }
}

