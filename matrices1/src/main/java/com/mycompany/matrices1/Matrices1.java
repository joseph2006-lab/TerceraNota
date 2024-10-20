

package com.mycompany.matrices1;

import java.util.Scanner;

public class Matrices1 {

    public static void main(String[] args) {
        int matriz[][]=new int [3][3];
        
        Scanner scanner = new Scanner(System.in); 
        for(int f=0;f<3;f++){
            for(int c =0;c<3;c++){
                System.out.println("Ingrese posicion para la fila "+f+" y para la columna "+c);
                matriz[f][c] = scanner.nextInt();

            }
        
        }
         for(int f=0;f<3;f++){
            for(int c =0;c<3;c++){
                System.out.println("En la fila: "+f+" y la columna: "+c);
                System.out.println("Se guarda el data de: "+matriz[f][c]);
                System.out.println("--------------------------------------");
            }
         }
    }
}
