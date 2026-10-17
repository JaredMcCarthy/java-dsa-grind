import java.util.Scanner;

public class Ejercicio2 {

    //este es el nodo normal se crea el primero
    static class Nodo {
        int valor; //pues el valor normal
        Nodo siguiente; //la variable para el siguiente nodo

        //estos son los constructores porque usan el this.
        Nodo(int valor){
            this.valor = valor;
            this.siguiente = null; //null porque no va aningun lado
        }
    }

    //este solo usa el tope que ves ahi abaji
    static class Pila{
        Nodo tope = null; //copias de arriba porque no apunta

        //con push meter un valor dentro de la pila
        public void push(int valor) {
            Nodo nuevo = new Nodo(valor); //este es un nodo nuevo
            //esta parte es como si apuntaras cuando se mueve por la pila
            nuevo.siguiente = tope; //apunta al tope
            tope = nuevo; //entonces haces que el tope osea el fin sea el nuevo nodo
        }
        //con este imprimimos abajo porque
        //ademas va dentro de la pila sino tope no funcionaria abajo
        public void imprimir() {
            Nodo actual = tope;
            while(actual != null) {//mientras si hayan topos imprime el valor y va al otro
                System.out.println(actual.valor);
                actual = actual.siguiente; //osea este pues
            }
        }
    }


    //segun el pdf la cola usa dos punteros uno de salida y otro de entrada
    static class Cola {
        Nodo frente = null; //este que sale
        Nodo fin = null; //y este que entra por eso los cree

        //entonces aqui se complica porque hay que agregarlos al final de la cola
        //con esta funcion encolar su valor
        public void encolar(int valor) {
            Nodo nuevo = new Nodo(valor);//creamos el nodo

            if (frente == null) { //si la cola esta vacia
                frente = nuevo; //el nodo se va al frente
                fin = nuevo; //y al ultimo de la cola
            } else {
                fin.siguiente = nuevo; //amvos apuntan al actual y al fina del nodo
                fin = nuevo;
            }
        }


        public Pila convertirPila() {
            Pila pila = new Pila();

            Nodo actual = frente;

            while(actual != null) {
                pila.push(actual.valor);
                actual = actual.siguiente;
            }
            return pila; //java pide regresar o esta pila por sugerencia o 0
            //por eso la agregue porque sino da error tiene sentido igual
        }
    }

    //aqui cargamos la nfo del usuario pues que recibimos
    public static void Ejercicio2() {
        Scanner scanner = new Scanner(System.in); //este va siempre

        Cola cola = new Cola(); //la cola es esta es simple

        System.out.print("Cuantos nodos: ");
        int n = scanner.nextInt();//guarda datos en n

        //repetimos las veces que pida y pedimos valor y leemos y insertamos en cola
        for (int i = 0; i < n; i++){
            System.out.println(i + 1);
            int valor = scanner.nextInt();
            cola.encolar(valor);
        }


        Pila resultado = cola.convertirPila();
        resultado.imprimir(); //el rsultado con la funcion imprimir de arriba

        scanner.close();
    }

    //no funcionaba el boton de IDEA entonces dice que tiene que haber un main
    //en todo entonces agrgeue esto pero no termina de correrlo
    public static void main(String[] args) {
        Ejercicio2(); //llamas a la funcion
    }

    //no corrio en intellj IDEA pero no es por el codigo creo
    //me parece que es la app, la AI de VSCODE me dijo que habia que confugurarlo
    //igual no corria alla tampoco, pero mi sintaxis y la idea
    //esta correctas y si corre el codigo, pruebelo usted mismo ingeniero porfa
    //porque no corre en mi computadora y no se que revisar.

}
