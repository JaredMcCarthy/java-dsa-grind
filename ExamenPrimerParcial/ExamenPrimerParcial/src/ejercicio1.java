

import java.util.Scanner; //este va siempre

//este si o si se crean para hacer la pila vacia pues
//hoy me quedo claro esto de las pilas
import java.util.Stack;


public class ejercicio1 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //va siempre

        System.out.println("Cuantos datos seran: "); //la cantidad de nodos
        int n = scanner.nextInt();//los guarda

        Stack<Integer> pila = new Stack<>(); //esta es la pila vacia asi se crea

        for (int i = 0; i < n; i++){
            System.out.println("Ingrese los valores: ");
            int valor = scanner.nextInt();
            pila.push(valor); //push sirve para meter datos en una pila IMPORTANTE
        }
        //aunque no exista la funcion aun la llamas aqui al final antes de cerrar
        double promedio = calcularPromedio(pila); //ese double es porque es un boolean
        System.out.print(promedio); //solo sirve para mostrar
    }

    //la funcion main no va con esta porque una pide u carga y esta
    //de aqui abajo calcula ese promedio
    public static double calcularPromedio(Stack<Integer> pila) {
        int suma = 0; //inicia en 0
        int contador = 0; //igual porque cuenta

        for (int valor : pila) { //esto recorre los nodos en la pila
            if (valor % 2 != 0) { //si es impar dice ahi
                suma += valor; //lo suma si es asi
                contador++; //aumenta el contador de arriba
            }
        }

        if (contador == 0){ //hace que nunca quede en 0
            return 0;
        }
        return (double) suma / contador; //java pedia dejarlo asi o en 0
    }

}
//eso es todo y si deberia funciona.