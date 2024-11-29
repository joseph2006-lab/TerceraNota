import java.util.Scanner;

public class numeroPrimo {

    public static boolean esPrimo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void imprimirPrimosHasta100() {
        System.out.println("Números primos entre 1 y 100:");
        for (int num = 1; num <= 100; num++) {
            if (esPrimo(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();


        if (esPrimo(numero)) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
        
        imprimirPrimosHasta100();

        scanner.close();
    }
}
