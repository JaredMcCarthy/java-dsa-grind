
import java.util.Scanner;

public class Ejercicio3 {
    static void main(String[] args) {
        int[] cursoA = new int[5];
        int[] cursoB = new int[5];

        Scanner scanner = new Scanner(System.in);

        int sumaA = 0;

        for(int i = 0; i < cursoA.length; i++) {
            sumaA += cursoA[i];
        }
        int promedioA = sumaA / 5;

        int sumaB = 0;

        for(int i = 0; i < cursoB.length; i++){
            sumaB += cursoB[i];
        }
        int promedioB = sumaB / 5;

        if(promedioA > promedioB){
            System.out.printf("Curso A tiene mayor promedio.");
        } else if (promedioB > promedioA) {
            System.out.printf("Cueso B tiene mayor promedio.");
        } else {
            System.out.printf("Empate");
        }

    }
}
