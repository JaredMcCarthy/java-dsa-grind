
import java.util.Scanner; //se usa al recibir del user

public class Ejercicio3 {

    static class Nodo {
        int valor;
        Nodo siguiente;

        Nodo(int valor) {
            this.valor = valor;
            this.siguiente = null;
        } //estos son los mismos valores del ejercicio 2 solo se copian
    }

    static class Cola {
        Nodo frente = null;
        Nodo fin = null;

        // Agrega el valor al fin de la cola
        //fijate que con la condicion es que si es nill fente se queda con e nuevo
        //y el ultimo con el nuevo igual
        public void encolar(int valor) {
            Nodo nuevo = new Nodo(valor);
            if (frente == null) {
                frente = nuevo;
                fin = nuevo;
            } else {
                fin.siguiente = nuevo; //sino si se mueven si no son null
                fin = nuevo;
            }
        }

        // saca el nodo del frente
        public int desencolar() {
            int valor = frente.valor;
            frente = frente.siguiente;
            if (frente == null) {
                fin = null;
            }
            return valor;
        }

        // Imprime la cola de frente a fin siempre que no sea null
        public void imprimir() {
            Nodo actual = frente;
            while (actual != null) {
                System.out.print(actual.valor + " ");
                actual = actual.siguiente;
            }
            System.out.println();
        }

        //esta es la funcion de la cola que recibe los datos
        //y esos reusltdos los mueve a la otra
        public Cola union(Cola otra) {
            Cola resultado = new Cola();

            //esta cola mueve los elementos a resultado
            Nodo actual = this.frente;
            while (actual != null) { //si no es null
                resultado.encolar(actual.valor);
                actual = actual.siguiente; //se mueve entonces
            }

            // movemos los elementos a resultados pero de otra cola
            actual = otra.frente;
            while (actual != null) { //si no so null
                resultado.encolar(actual.valor); //se mueven con encolar
                actual = actual.siguiente;
            }
            return resultado;
        }
    }

    //esta es ;a funcion donde solo de cargan los datos del usuario
    //siempre al final porque lo demas va abajo
    public static void ejercicio3() {
        Scanner scanner = new Scanner(System.in); //siempre va

        //como usamos dos colas entonces las creas las dos asi
        //o las que necesites
        Cola cola1 = new Cola();
        Cola cola2 = new Cola();

        //mismo que siempre se pide la cant de nodos al user
        System.out.print("Cuantos nodos: ");
        int n = scanner.nextInt(); //se guarda

        //aqui llenamos la cola 1 primero
        //porque son las veces que diga el usuario
        System.out.println("Cola 1:"); //estetico nada mas
        for (int i = 0; i < n; i++) { //se recorre
            System.out.print("  Valor " + (i + 1) + ": "); //ese mas 1 es porque inicia valor 1 y no en 0
            int valor = scanner.nextInt();
            cola1.encolar(valor);
        }

        //aqui llenamos la cola 2 que viene
        System.out.println("Cola 2:"); //esto es estetico
        for (int i = 0; i < n; i++) { //otravez se recorre
            System.out.print("  Valor " +  (i + 1) + ": "); //igual que arriba lea
            int valor = scanner.nextInt(); //guardamos en valor
            cola2.encolar(valor);//guardamos el valor en encolar
        }

        //este slo miestra los datos nada mas con sus funciones
        //todas se crean por separado y se unen al final con el ejercicio3
        Cola resultado = cola1.union(cola2);
        resultado.imprimir();
        scanner.close();
    }

    //siempre va porque sino no correo en la app
    public static void main(String[] args) {
        ejercicio3();
    }
}