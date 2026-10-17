import java.util.Scanner; //Siempre va

public class Ejercicio4 {

    //TODO ESTO SE CREA AL INICIO EN TODOS, SOLO SE COPIA
    static class Nodo {
        int valor;
        Nodo siguiente;

        Nodo(int valor) {
            this.valor = valor;
            this.siguiente = null;
        }
    } //HASTA AQUI SE OPCIA, EJERCICIO 2 Y 3 SON LO MISMO

    static class Lista {
        Nodo cabeza = null; //se deja en null porque no apunta a ningun lado

        //este agrega los  nodos al final de la lista
        public void agregar(int valor) {
            Nodo nuevo = new Nodo(valor); //se crea un nuevo nodo asi

            if (cabeza == null) { //revisa si no es null si no lo deja al inicio
                cabeza = nuevo;
            } else {
                Nodo actual = cabeza;
                while (actual.siguiente != null) {
                    actual = actual.siguiente;
                }
                actual.siguiente = nuevo; //lo mueve si cumple
            }
        }

        //con el while recorremos todo los nodos
        public int contarPositivos() {
            int contador = 0;
            Nodo actual = cabeza;

            while (actual != null) { //tambien cuenta con w while cuantos tienen
                if (actual.valor > 0) { //valor mayor a 0
                    contador++; //y lo va sumando al contador +1
                }
                actual = actual.siguiente; //entonces lo mueve el siguiente si si cumple
            }

            return contador;
        }

        // mostramos toda la lista en total
        public void imprimir() {
            Nodo actual = cabeza;
            while (actual != null) {
                System.out.print(actual.valor + " ");
                actual = actual.siguiente;
            }
            System.out.println(); //ya no se usa return se deja vacio
        }
    }

    //de aqui para abajo las cosas son siempre asi, solo se cargan los usuarios
    //en casi todos los ejercicios aqui con for y scanner y demas
    public static void ejercicio4() {
        Scanner scanner = new Scanner(System.in); //siempore va al pedir info del user

        Lista lista = new Lista(); //se crea la pila entonces aqui simple

        // entonces pedimos al usuario los nodos
        System.out.print("Cuantos nodos: ");
        int n = scanner.nextInt();

        // este llena una lista primero con los datos del usuario
        for (int i = 0; i < n; i++) {
            System.out.print("Valor " + (i + 1) + ": "); //+! porque no empieza en 0 siempre
            int valor = scanner.nextInt();
            lista.agregar(valor); //se agregan a funcion agregar
        }

        // crea esta variable para llamarla abajo para llamar los metodos
        //siempre se hace como en el 3 con resultados
        int positivos = lista.contarPositivos();

        // muestra igua que los otros ejercicios al final siempre
        lista.imprimir();
        System.out.println("Nodos positivos: " + positivos);

        scanner.close();
    }

    //lama al ultimo ejercicio para que corra la app
    public static void main(String[] args) {
        ejercicio4();
    }
}
//codigo funciona, y si cuenta los positivos, lo mas comolicad fue contar positivo nada mas
//revise mi codigo porque este si corre no como el ejercicio 2 que no me dejo claro porque.