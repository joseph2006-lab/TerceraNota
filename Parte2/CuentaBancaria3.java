
class FondosInsuficientesException extends Exception {
    public FondosInsuficientesException(String mensaje) {
        super(mensaje);
    }
}
class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("La cantidad a depositar debe ser positiva.");
        }
    }

    public void retirar(double cantidad) throws FondosInsuficientesException {
        if (cantidad > saldo) {
            throw new FondosInsuficientesException("Fondos insuficientes. Saldo disponible: " + saldo);
        } else if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad a retirar debe ser mayor que cero.");
        }
        saldo -= cantidad;
        System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
    }
}
public class CuentaBancaria3 {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Juan Pérez", 1000.00);

        try {
            System.out.println("Saldo inicial: " + cuenta.getSaldo());

            cuenta.retirar(200.00);

            cuenta.retirar(900.00);

        } catch (FondosInsuficientesException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Saldo final: " + cuenta.getSaldo());
        }
    }
}

