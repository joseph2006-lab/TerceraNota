import java.util.ArrayList;
import java.util.List;

public class MoverCeros3 {

    public static Object[] moverCeros(Object[] array) {
        List<Object> noCeros = new ArrayList<>();
        List<Object> ceros = new ArrayList<>();

        for (Object elemento : array) {
            if (elemento.equals(0)) {
                ceros.add(elemento); 
            } else {
                noCeros.add(elemento); 
            }
        }

        noCeros.addAll(ceros);

        return noCeros.toArray(); 
    }

    public static void main(String[] args) {
        Object[] entrada = {false, 1, 0, 1, 2, 0, 1, 3, "a"};
        Object[] resultado = moverCeros(entrada);

        // Mostrar el resultado
        System.out.print("Resultado: ");
        for (Object elemento : resultado) {
            System.out.print(elemento + " ");
        }
    }
}

