

//ESDTOS SON MUY IMPORTANTES PORQUE TODOS SON PARA ESTE TIPO DE ENCRIPTACIONES
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

//esta es la principal funcion el nombre del archivo
public class Ejercicio1 {

    //funcion donde se usa el hash que es la funcion uno
    public static String hashear(String input) throws NoSuchAlgorithmException {

        //Este es el inicio del hash 256 las primeras tres lineas.
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] encodehash = digest.digest(input.getBytes(StandardCharsets.UTF_8));
        String resultado = "";

        for(int b = 0; b < encodehash.length; b++ ){
            resultado = resultado + (String.format("%02x", encodehash[b] & 0xFF));
        }
        //SI NO agregaba este me daba error, como la funcion siempre debe regresar algo, entonce en lugar de 0 regreso resultado mas practico
        return resultado;
    }

    //funcion dos
    static void main(String[] args) {

        // estos son los hash de admin y hash de 1234 segun lo visto
        String hashUsuarioGuardado = "8c6976e5b5410415bde908bd4dee15dfb167a9c873fc4bb8a81f6f2ab448a918";
        String hashPassGuardado = "03ac674216f3e15c761ee1a5e255f067953623c8b388b4459e13f978d7c846f4";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Usuario: ");
        String usuario = scanner.nextLine();

        System.out.print("Contraseña: ");
        String password = scanner.nextLine();

        //bueno el try era la mejor opcion y la que salia den la funcion de cargar
        try {
            if (hashear(usuario).equals(hashUsuarioGuardado) && hashear(password).equals(hashPassGuardado)) {
                System.out.println("Acceso concedido");
            } else {
                System.out.println("Usuario o contraseña incorrectos");
            }
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Error: algoritmo no encontrado");
        }
    }
} //todo dentro de esta funcion ejercicio1 siempre es asi en los ejercicios.