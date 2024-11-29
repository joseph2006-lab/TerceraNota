public class Isograma {
    public static boolean esIsogram(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }

        str = quitarAcentos(str.toLowerCase());

        str = str.replaceAll("[^a-z]", "");

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (str.indexOf(currentChar) != str.lastIndexOf(currentChar)) {
                return false;
            }
        }

        return true; // Es un isograma
    }

    private static String quitarAcentos(String str) {
        // Unir todas las operaciones en una única cadena de reemplazos
        str = str.replaceAll("[áàäâã]", "a")
                .replaceAll("[éèëê]", "e")
                .replaceAll("[íìïî]", "i")
                .replaceAll("[óòöôõ]", "o")
                .replaceAll("[úùüû]", "u")
                .replaceAll("[ýÿ]", "y")
                .replaceAll("[ñ]", "n");
        return str;
    }

    public static void main(String[] args) {
        System.out.println(esIsogram(""));              
        System.out.println(esIsogram("reto"));          
        System.out.println(esIsogram("múrcielago"));    
        System.out.println(esIsogram("PeRrO"));         
        System.out.println(esIsogram("GaTo"));          
        System.out.println(esIsogram("dos palabras"));  
    }
}

