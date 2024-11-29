import java.util.Scanner;

public class DivisionPorCero3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Introduce el primer número: ");
            double numero1 = scanner.nextDouble();

            System.out.print("Introduce el segundo número: ");
            double numero2 = scanner.nextDouble();

            double resultado = dividir(numero1, numero2);
            System.out.println("El resultado de la división es: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        } finally {
            System.out.println("Programa finalizado.");
            scanner.close();
        }
    }
    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return a / b;
    }
}
