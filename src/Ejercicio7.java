

import java.util.Scanner;

public class Ejercicio7 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tamaña vector N: ");
        int n = scanner.nextInt();

        System.out.printf("Tamaño vector M: ");
        int m = scanner.nextInt();

        int[][] matriz = new int[n][m];

        for (int i = 0; i < matriz.length; i++){
            for(int c = 0; c < matriz[0].length; c++){
                System.out.print("Ingrese un numero: ");
                matriz[i][c] = scanner.nextInt();
            }
        }

        for(int c = 0; c < matriz[0].length; c++){
            int temp = matriz[0][c];
            matriz[0][c] = matriz[1][c];
            matriz[1][c] = temp;
        }

        for (int i = 0; i < matriz.length; i++){
            for(int c = 0; c < matriz[0].length; c++){
                System.out.print(matriz[i][c] + " ");
            }
            System.out.println();
        }

    }
}
