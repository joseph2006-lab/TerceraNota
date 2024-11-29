import java.util.HashMap;

public class Palindromo3 {

    public static boolean puedeSerPalindromo(int numero) {
        String strNumero = String.valueOf(numero);

        HashMap<Character, Integer> frecuencia = new HashMap<>();
        for (char digito : strNumero.toCharArray()) {
            frecuencia.put(digito, frecuencia.getOrDefault(digito, 0) + 1);
        }

        int conteoImpares = 0;

        for (int freq : frecuencia.values()) {
            if (freq % 2 != 0) {
                conteoImpares++;
            }
        }

        return conteoImpares <= 1;
    }

    public static void main(String[] args) {
        System.out.println(puedeSerPalindromo(5));       
        System.out.println(puedeSerPalindromo(2121));     
        System.out.println(puedeSerPalindromo(1331));     
        System.out.println(puedeSerPalindromo(3357665)); 
        System.out.println(puedeSerPalindromo(1294));     
    }
}

