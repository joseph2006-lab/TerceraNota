import java.text.Normalizer;

public class LetrasPorNumeros3 {

    public static String func(String str) {
        str = limpiarString(str);

        StringBuilder resultado = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                int index = Character.toLowerCase(c) - 'a' + 1;
                resultado.append(index).append(" ");
            }
        }

        return resultado.toString().trim();
    }

    private static String limpiarString(String str) {
        str = str.replaceAll("\\s+", "");
        
        str = Normalizer.normalize(str, Normalizer.Form.NFD);
        str = str.replaceAll("[^\\p{ASCII}]", "");

        return str;
    }

    public static void main(String[] args) {
        System.out.println(func("abc def"));  
        System.out.println(func("ÁbC Dèf!")); 
    }
}
