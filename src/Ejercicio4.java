
//se importa igual que el scanner el sort
import java.util.Scanner;

//PARA QUE NO TE CONFUNDAS JARED
public class Ejercicio4 {
    static void main(String[] args) {
        int[] numeros = new int[10]; //VECTOR

        Scanner scanner = new Scanner(System.in);
        boolean ordenado = true; //boolean y scannwr normal

        //ESTE FOR PIDE LOS DATOS Y LOS GUARDA MIRA BIEN
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Ingrese sus numeros al azar: ");
            numeros[i] = scanner.nextInt();
        }

        //ESTE VA DEL 0 AL ANTEULTIMO Y COMPARA EL INDICE INICIAL AL DE ENFRENTE Y DA DALSE SI ES MENOR
        for(int i = 0; i < numeros.length - 1; i++){
            if (numeros[i] > numeros[i+1]){
                ordenado = false;
            }
        }

        //NO COMPARAMOS EL ARRAY ENTERO ENTONCE USAMOS EL BOOLEAN PARA SABER SI ES FALSE O TRUE
        if (ordenado){
            System.out.println("Ordenado");
        }else {
            System.out.println("No ordenado");
        }
    }
}
