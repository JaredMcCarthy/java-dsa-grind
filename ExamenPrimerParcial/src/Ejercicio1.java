
//este se importa siempre para pedir al usuario
import java.util.Scanner;

public class Ejercicio1 {
    static void main(String[] args) {
        int[] vectoruno = new int[8];

        //creamos 3 variables
        int acumuladoTotal = 0;
        int cantidadMayores36 = 0;
        int cantidadMayores50 = 0;

        //Creamoe el espacio al usuario y pedimos la info
        Scanner teclado = new Scanner(System.in);

        //recorre del 1 al 8 con el vector del inicio que son 8
        for (int i = 0; i < vectoruno.length; i++) {

            //este iba dentro lo del usuario
            System.out.print("Ingrese el numero: ");
            vectoruno[i] = teclado.nextInt(); //igual el i siempre dentro del indice vectoruno y leemos eso del usuario
        }

        for(int i = 0; i < vectoruno.length; i++) {
            acumuladoTotal += vectoruno[i];

            //esta es la parte de las condicionales para saber que numeron es
            if (vectoruno[i] > 36) {
                cantidadMayores36 += vectoruno[i];
            } if (vectoruno[i] > 50) { //solo if porque asi se cumplen ambas si llega a 60
                cantidadMayores50 += 1; //lo va sumando todo para el 50 para arriba
            }
        }
        System.out.println("Total es: " + acumuladoTotal);
        System.out.println("Mayores a 36: " + cantidadMayores36);
        System.out.println("Mayores a 50: " + cantidadMayores50);
    }
}
