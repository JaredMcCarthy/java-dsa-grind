import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Base64;

public class Main {

    public static void main(String[] args) throws Exception {
        String mensaje = "Hola mundo";

        // probamos los 3 algoritmos con el mismo mensaje
        probar("DES", 56, mensaje);
        probar("DESede", 168, mensaje);   // DESede es 3DES
        probar("AES", 128, mensaje);
    }

    public static void probar(String algoritmo, int bits, String mensaje) throws Exception {
        // creamos la clave
        KeyGenerator gen = KeyGenerator.getInstance(algoritmo);
        gen.init(bits);
        SecretKey clave = gen.generateKey();

        // ciframos con la clave
        Cipher c = Cipher.getInstance(algoritmo);
        c.init(Cipher.ENCRYPT_MODE, clave);
        byte[] cifrado = c.doFinal(mensaje.getBytes());

        // desciframos con la misma clave
        c.init(Cipher.DECRYPT_MODE, clave);
        byte[] original = c.doFinal(cifrado);

        System.out.println("Algoritmo: " + algoritmo);
        System.out.println("Cifrado: " + Base64.getEncoder().encodeToString(cifrado));
        System.out.println("Descifrado: " + new String(original));
        System.out.println();
    }
}