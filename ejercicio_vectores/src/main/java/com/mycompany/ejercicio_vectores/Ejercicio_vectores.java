

package com.mycompany.ejercicio_vectores;

import java.util.Scanner;

public class Ejercicio_vectores {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int vector[]= new int[4];
        
        for(int i =0;i<vector.length;i++){
            System.out.println("Ingrese el valor para el indice "+i);
            vector[i] = scanner1.nextInt();
            
         
        
        }
        for (int i =0;i<vector.length;i++){
            System.out.println("El valor es: "+vector[i]+" y se encuentra en el indice "+i);
            System.out.println("-------------");
        }

    }
            
            

            

            
    
    
}
