
import java.util.Scanner;

public class Ejercicio9 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Hasta aqui todo bien esto lo se hacer a ojos cerrados la vdd
        System.out.printf("Cuantos estudiantes son? : ");
        int est = scanner.nextInt();
        scanner.nextLine();

        //de aqui abajo viene lo complicado
        //aqui se guardan esos 3 datos que se almacenan arriba pues
        String[] nombre = new String[est];
        String[] cuenta = new String[est];
        String[] carrera = new String[est];

        //aqui es donde se cargan los datos, oisea se guardan en las variables, con el indice
        //es sencillo, lo mismo solo de diferente ese indice que creaste arriba pues
        for (int i = 0; i < est; i++){
            System.out.println("Alumno: " + i + 1);
            System.out.printf("Cuenta: ");
            cuenta[i] = scanner.nextLine();

            System.out.printf("Nombre: ");
            nombre[i] = scanner.nextLine();

            System.out.printf("Carrera: ");
            carrera[i] = scanner.nextLine();
        }

        //aqui muestra los datos el for, siempre con indice hermano en la que creaste arriba la variable
        for (int i = 0; i < est; i++){
            System.out.println("Nombre: " + nombre[i]);
            System.out.println("Cuenta: " + cuenta[i]);
            System.out.println("Carrera: " + carrera[i]);
        }

        // lN es para linea, printf es para ir abajo

        //termina el scanner
        scanner.close();

    }
}
