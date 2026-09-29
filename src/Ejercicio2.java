
import java.util.Scanner;

public class Ejercicio2 {
    static void main(String[] args){
        //primero son los vectores donde se guardan los numeros
        int[] vector1 = new int[4];
        int[] vector2 = new int[4];
        int[] vector3 = new int[4];

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 4; i++) {
            System.out.println("Ingrese el numero 1: ");
            vector1[i] = scanner.nextInt();
        }

        for(int i = 0; i < 4; i++){
            System.out.println("Ingrese el numero 2: ");
            vector2[i] = scanner.nextInt();
        }

        for(int i = 0; i < 4; i++){
            vector3[i] = vector1[i] + vector2[i];
        }

        for(int i = 0; i < 4; i++){
            System.out.println("El vector tres es:" + vector3[i]);
        }

    }
}
