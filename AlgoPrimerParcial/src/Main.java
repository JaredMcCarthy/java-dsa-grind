
import java.util.Scanner; // se importa para usar el scanner siempre

void main(String[] args) {
    Scanner scanner = new Scanner(System.in); //scanner

    System.out.printf("Ingrese el tamaño de N: ");
    int n = scanner.nextInt(); //pedir tamano y guardarlo

    int[] arreglo = new int[n]; //este es el nuevo arreglo

    for (int i = 0; i < arreglo.length; i++) { //este es for de carga
        System.out.printf("Ingrese un numero: ");//solo recibe el arreglo
          arreglo[i] = scanner.nextInt();//y guarda
    }

    int[] resultado = ordenar(arreglo);//variable resultado ordenadndo el aregelo
                                        //fuera del for de carga

    for (int i = 0; i < arreglo.length; i++) {
        System.out.println(resultado[i]); //azqui sacas el resultado en el terminal
    }

}

//funcion fuera de main que ordena los elementos
//que igual llamamos arrriba es una funcion ordenar.
static int[] ordenar(int[] arreglo) {
    for (int i = 0; i < arreglo.length; i++){ //recorre el primer i
        for (int j = 0; j < arreglo.length - 1 - i; j++) { //este se mueve a comprarar
            if (arreglo[j] > arreglo[j+1]){ //si es mayor se mueve sino no
                int temp = arreglo[j];
                arreglo[j] = arreglo[j+1];
                arreglo[j+1] = temp;
            }
        }
    }
    return arreglo; //regresamos el arreglo ya editado
}