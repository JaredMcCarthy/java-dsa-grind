public class Ejercicio1 {
    public static void main(String[] args) {
        Pila pila1 = new Pila();
        pila1.insertar(10);
        pila1.insertar(40);
        pila1.insertar(3);
        pila1.imprimir();
        System.out.println(pila1.verPrimero()); //este solo se uisa para mostrar los datos de las funciones de abajo
        System.out.println(pila1.promedio()); //mostramos promedio
    }
}

//temas a repasar: lo de poner la clase ejercicio1 porque se me hizo dificil entender que iba pila la clase fuera de ejercicio1

//todo lo demas va aqui donde funcionan las cosas como mostrar nodos o moverlos

class Pila {
    private class Nodo { //aqui se crea un NODO
        int info;
        Nodo sig;
    }

    private Nodo raiz;

    public Pila() {
        raiz = null;
    }

    public void insertar(int x) {
        Nodo nuevo = new Nodo(); //pues este mueve los nodos al siguiente y asi en circulos
        nuevo.info = x;
        nuevo.sig = raiz;
        raiz = nuevo;
    }

    public void imprimir() { //este solo imprime si no esta vacio revisa primero con while
        Nodo reco = raiz;
        System.out.println("Lista de los elementos en la pila: ");
        while (reco != null) {
            System.out.print(reco.info + "-");
            reco = reco.sig;
        }
        System.out.println();
    }

    public int verPrimero() { //muestra nada mas el nodo que sale en primer lugar en la pila
        if (raiz != null) {
            int informacion = raiz.info;
            return informacion;
        } else {
            return Integer.MAX_VALUE;
        }
    }


    //es basicamente el metodo que divide esos numeros moviendo la raiz
    //creamos dos variables que es cantidad yu suma para mostrar
    public double promedio() {
        Nodo reco = raiz;
        int suma = 0;
        int cantidad = 0;
        while (reco != null) {
            suma = suma + reco.info;
            cantidad = cantidad + 1;
            reco = reco.sig;
        }
        if (cantidad == 0) {
            return 0;
        } else {
            return (double) suma / cantidad;
        }
    }
}
