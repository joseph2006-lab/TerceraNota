import java.util.Scanner;

public class ModificarArray2 {

    public static void modificarArray(int[] arr, int factor) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= factor;
        }
        System.out.println("Dentro del método: " + java.util.Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println("Antes de modificar: " + java.util.Arrays.toString(numeros));

        System.out.print("Introduce el número por el que deseas multiplicar los valores del arreglo: ");
        int factor = scanner.nextInt(); 

        modificarArray(numeros, factor);

        System.out.println("Después de modificar: " + java.util.Arrays.toString(numeros));

        scanner.close(); 
    }
}

