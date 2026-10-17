import java.util.Scanner;

public class Ejercicio8 {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Tamaño vector N: ");
        int n = scanner.nextInt();

        System.out.print("Tamano vector m: ");
        int m = scanner.nextInt();

        int[][] matriz = new int[n][m];

        for (int i = 0; i < matriz.length; i++){
            for (int c = 0; c < matriz.length; c++){
                System.out.println("Ingrese un numero: ");
                matriz[i][c] = scanner.nextInt();
            }
        }

        System.out.print(matriz[0][0]);
        System.out.print(matriz[0][matriz[0].length - 1]);
        System.out.print(matriz[matriz.length - 1][0]);
        System.out.print(matriz[0].length - 1); //este cambio nada mas creo

    }
}
