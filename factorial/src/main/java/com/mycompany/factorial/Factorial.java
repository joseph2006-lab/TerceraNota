
package com.mycompany.factorial;

import java.util.Scanner;


public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero para hallarle eñ factorial: ");
        int numero = scanner.nextInt();
        int factorial = 1;
        int i = 1;
        while(i<numero){
            factorial *=i;
            i ++;
        }
        System.out.println("El factorial del numero "+ numero+ " es "+factorial);
    }
}
