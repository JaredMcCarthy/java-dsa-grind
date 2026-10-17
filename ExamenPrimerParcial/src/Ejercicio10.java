
import java.util.Scanner;

public class Ejercicio10 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Cuantos estudiantes son: ");
        int est = scanner.nextInt();
        scanner.nextLine(); //aqui estaba el erro, falto limpiar la linea jaja ya quedio

        String[] nombre = new String[est];
        String[] cuenta = new String[est];
        String[] carrera = new String[est];

        //de carga
        for (int i = 0; i < est; i++){
            System.out.println("Alumno: " + i + 1);

            System.out.printf("Cuenta: ");
            cuenta[i] = scanner.nextLine();

            System.out.printf("Nombre: ");
            nombre[i] = scanner.nextLine();

            System.out.printf("Carrera:" );
            carrera[i] = scanner.nextLine();

        }

        //de impresion
        //es simple un if dentro del for, aqui usamos equialsignorecase porque me daba error
        // y googleando me salio que eso podria funcionar y si funciono
        //el problema? que no me deja agregar cuenta y no se porque...
        for (int i = 0; i < est; i++){
            if (carrera[i].equalsIgnoreCase("infotecnologia")){
                System.out.println("Estudiante: " + nombre[i]);
                System.out.println("Cuenta: " + cuenta[i]);
                System.out.println("Carrera: " + carrera[i]);
            } else {
                System.out.println("No es de infotecnologia.");
            }

        }

        scanner.close();

    }
}
