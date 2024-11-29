import java.util.Scanner;

class NumeroNegativoException extends Exception {
    public NumeroNegativoException(String mensaje) {
        super(mensaje);
    }
}

public class RaizCuadrada3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Introduce un número para calcular su raíz cuadrada: ");
            double numero = scanner.nextDouble();

            double resultado = calcularRaizCuadrada(numero);
            System.out.println("La raíz cuadrada de " + numero + " es: " + resultado);

        } catch (NumeroNegativoException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        } finally {
            System.out.println("Programa finalizado.");
            scanner.close();
        }
    }
    public static double calcularRaizCuadrada(double numero) throws NumeroNegativoException {
        if (numero < 0) {
            throw new NumeroNegativoException("No se puede calcular la raíz cuadrada de un número negativo.");
        }
        return Math.sqrt(numero);
    }
}

