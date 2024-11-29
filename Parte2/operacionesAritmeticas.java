
import java.util.Scanner;

public class operacionesAritmeticas
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("algoritmo para hacer las operaciones aritmeticas");
        
        System.out.println("ingrese el primer numero");
        float numero1=scanner.nextFloat();
        System.out.println("ingrese el Segundo numero");
        float numero2=scanner.nextFloat();
        
        float suma = numero1 + numero2;
        float resta = numero1 - numero2;
        float multiplicacion = numero1 * numero2;
        float division = numero1 / numero2;
        float modulo = numero1 % numero2;
        
        
        System.out.println ("La suma es:" + suma);
        System.out.println ("La resta es:" + resta);
        System.out.println ("La multiplicacion es:" + multiplicacion);
        System.out.print ("La division es:" + division);
        System.out.print( "El modulo es:" + modulo);

    }
}
