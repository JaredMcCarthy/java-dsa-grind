



import java.util.Hashtable;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    // aqui se guardan los empleados, la llave es el codigo hasheado y el valor es el nombre
    static Hashtable<Integer, String> tabla = new Hashtable<Integer, String>();

    // convierte el codigo en un numero con hash, es encriptacion que use del codigo que sacamos de expos
    static int hacerHash(String codigo) {
        return codigo.hashCode();
    }

    // pasa las llaves de la tabla a un arreglo para poder recorrerlas con recursividad
    static Integer[] sacarLlaves() {
        Integer[] llaves = new Integer[tabla.size()];
        int i = 0;
        for (Integer llave : tabla.keySet()) {
            llaves[i] = llave;
            i++; //summa ambas
        }
        return llaves; //era esto o dejarlo en 0 porque me daba error
    }

    // funcion recursiva quw revisa de uno en uno y se llama a si misma con la siguiente posicion
    static boolean eliminarPorNombre(Integer[] llaves, int pos, String nombre) {
        if (pos >= llaves.length) {
            return false; // ya llego al final y no lo encontro
        } else {
            if (tabla.get(llaves[pos]).equalsIgnoreCase(nombre)) {
                tabla.remove(llaves[pos]);
                return true;
            }
            return eliminarPorNombre(llaves, pos + 1, nombre);
        }
    }

    // funcion recursiva que es la que imprime uno y se llama a si misma con el siguiente
    static void imprimirLista(Integer[] llaves, int pos) {
        if (pos < llaves.length) {
            System.out.println("codigo: " + llaves[pos] + "  nombre: " + tabla.get(llaves[pos]));
            imprimirLista(llaves, pos + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        int contador = 0;

        // el menu se repite hasta que el usuario elija 7
        while (opcion != 7) {
            System.out.println("MENU");
            System.out.println("1.Ingrese Nuevo Empleado");
            System.out.println("2.Buscar Empleado por Codigo");
            System.out.println("3.Buscar Empleado por Nombre");
            System.out.println("4.Elimine Empleado por Codigo");
            System.out.println("5.Elimine Empleado por Nombre");
            System.out.println("6.Imprima listado de empleados");
            System.out.println("7.Salir");
            System.out.println("ingrese la opcion: ");

            // si aqui escribe letras en vez de numero no se cae y solo da opcion invalida
            try {
                opcion = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                opcion = 0;
            }

            // le pedimos codigo y nombre, valida que no esten vacios y los guarda
            if (opcion == 1) {
                System.out.print("codigo: ");
                String codigo = sc.nextLine();
                System.out.print("nombre: ");
                String nombre = sc.nextLine();

                //metodos utiles que encontre en google para concatenar los nombres sin espacios ahi abajo sale
                if (codigo.contains(" ") || codigo.equals("") || nombre.trim().equals("")) {
                    System.out.println("no se puede espacios en blanco");
                } else {
                    int llave = hacerHash(codigo);
                    // si el codigo ya esta en la tabla no lo deja repetir
                    if (tabla.containsKey(llave)) {
                        System.out.println("ese codigo ya exsiste");
                    } else {
                        tabla.put(llave, nombre);
                        System.out.println("empleado agregado");
                    }
                }

                // le pedimos un codigo, lo hashea y busca ese numero en la tabla
            } else if (opcion == 2) {
                System.out.print("codigo a buscar: ");
                String codigo = sc.nextLine();
                int llave = hacerHash(codigo);
                String nombre = tabla.get(llave);
                // get devuelve null cuando no existe la llave
                if (nombre != null) {
                    System.out.println("encontrado: " + nombre);
                } else {
                    System.out.println("no encontrao");
                }

                // aqui recorremos todos los empleados comparando el nombre sin importar mayusculas
            } else if (opcion == 3) {
                System.out.print("nombre a buscar: ");
                String nombre = sc.nextLine();
                boolean encontrado = false;
                for (Integer llave : tabla.keySet()) {
                    if (tabla.get(llave).equalsIgnoreCase(nombre)) {
                        System.out.println("encontrado, codigo: " + llave + " nombre: " + tabla.get(llave));
                        encontrado = true;
                    }
                }
                if (encontrado == false) { //esto me sale de color amarillo pero no se porque la verdad, talvez usted si sabra
                    System.out.println("no encontrao"); //se cumple aqui y sale cuando no se encuentra con el codigo en la opc 3
                }

                // le pedimos ahi el codigo, lo hashea y si existe lo borra de la tabla
            } else if (opcion == 4) {
                System.out.print("codigo a eliminar: ");
                String codigo = sc.nextLine();
                int llave = hacerHash(codigo);
                if (tabla.containsKey(llave)) {
                    tabla.remove(llave);
                    System.out.println("empleado eliminado");
                } else {
                    System.out.println("no encontrao");
                }

                // le pide el nombre y llama a la funcion recursiva para eliminarlo
            } else if (opcion == 5) {
                System.out.print("nombre a eliminar: ");
                String nombre = sc.nextLine();
                Integer[] llaves = sacarLlaves();
                boolean eliminado = eliminarPorNombre(llaves, 0, nombre);
                if (eliminado) {
                    System.out.println("empleado eliminado");
                } else {
                    System.out.println("no encontrao");
                }

                // si hay empleados llama a la funcion recursiva que los imprime
            } else if (opcion == 6) {
                if (tabla.isEmpty()) {
                    System.out.println("no hay empleados");
                } else {
                    Integer[] llaves = sacarLlaves();
                    imprimirLista(llaves, 0);
                }

                // esta ssolo avisa que sale el while se termina solo porque opcion vale 7
            } else if (opcion == 7) {
                System.out.println("saliendo...");

                // cualquier otro numero o letra cae aqui
            } else {
                System.out.println("opcion mala, intente denuevo");
            }
        }
    }
}