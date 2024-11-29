import java.util.Scanner;

public class e1 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("ingrese el primer numero");
        int number1 = scan.nextInt();

        System.out.println("ingrese el segundo numero");
        int number2 = scan.nextInt();

        System.out.println("ingrese el tercer numero");
        int number3 = scan.nextInt();

        int major;

        if((number1 > number2) && (number1 > number3)) {
            major = number1;
        }
        else if((number2 > number1)&& (number2 > number3)) {
            major = number2;
        }
        else {
            major = number3;
        }

        System.out.println("el numero mayor es: " + major);
    
    }
    
}
