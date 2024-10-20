
package com.mycompany.vectores1;


public class Vectores1 {

    public static void main(String[] args) {
        int vector[] = new int[4];
        
        vector[0]=3;
        vector[1]=12;
        vector[2]=20;
        vector[3]=90;
        for(int i=0;i<vector.length;i++){
            System.out.println("estas en el indice: "+i+"y esa posicion contiene el dato:"+vector[i]);

        }
        int numeros[]={1,2,3,4,5,6,7}; // es otra forma de recorrer vectores pero en el sout se llaman es a la variable del for y no al vector
        for(int numero : numeros){
            System.out.println("El arrays contien los valodes de:"+numero);
        }
    }  
    
}
