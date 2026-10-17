import java.util.Scanner;

public class Ejercicio6 {
    static void main(String[] args) {
        int[][] matriz = new int[2][5]; //asi se crea una matriz

        Scanner scanner = new Scanner(System.in);

        //con este se cargan datos desde la columna y no fila
        for (int c = 0; c < matriz[0].length; c++){ //c columna
            for (int i = 0; i < matriz.length; i++){ // i fila
                System.out.println("Ingrese un numero: ");
                matriz[i][c] = scanner.nextInt(); //no olvides i y c siempre
            }
        }

        //con este se muestra esos numeros es alreves mira el anterior for
        for (int i = 0; i < matriz.length; i++){
            for (int c = 0; c < matriz[0].length; c++){
                System.out.print(matriz[i][c] + " ");
            }
            System.out.println();
        }
    }
}
