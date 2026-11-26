package Ejercicios3;
import java.util.Scanner;

public class problema3_1 {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Ingrese un numero de la semana: ");
        int numero = scanner.nextInt();

        switch (numero) {
            case 1:
                System.out.print(numero + " -> Lunes");
                break;
            case 2:
                System.out.printf(numero + " -> Martes");
                break;
            case 3:
                System.out.print(numero + " -> Miercoles");
                break;
            case 4:
                System.out.print(numero + " -> Jueves");
                break;
            case 5:
                System.out.print(numero + " -> Viernes");
                break;
            case 6:
                System.out.print(numero + " -> Sabado");
                break;
            case 7:
                System.out.print(numero + " -> Domingo");
                break;
            default:
                System.out.print(numero + " -> Numero invalido.");
        }
    }
}

//fuente: https://javautodidacta.es/como-funciona-un-switch-en-java/#tab-con-15
