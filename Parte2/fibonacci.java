public class fibonacci {
    public static void main(String[] args) {
        
        final int NUMERO_MAYOR = 50;
        long numeroInicial = 0;
        long numeroSiguiente = 1;
        long numeroResultado;

        System.out.print(numeroInicial + ", "+ numeroSiguiente);
        for(int i = 2; i < NUMERO_MAYOR; i ++){

            numeroResultado = numeroInicial + numeroSiguiente;
            System.out.print(", " + numeroResultado);
            numeroInicial = numeroSiguiente;
            numeroSiguiente = numeroResultado;

        
        }
    }
    
}
