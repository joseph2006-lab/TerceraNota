

package com.mycompany.ejercicioclase;


public class EjercicioClase {

    public static void main(String[] args) {
        
        Alumno alu1= new Alumno(16,"Joseph","Vargas");
        Alumno alu2 = new Alumno();
        Alumno alu3 = new Alumno(14,"Jose","Miguel");
        
        System.out.println("El codigo es"+ alu1.getId());
        System.out.println("El nombre es "+ alu1.getNombre());
        System.out.println("El apellido es "+ alu1.getApellido());
        
        alu2.setId(12);
        alu2.setNombre("Martin");
        alu2.setApellido("Ropero");
        System.out.println("El codigo es"+ alu2.getId());
        System.out.println("El nombre es "+ alu2.getNombre());
        System.out.println("El apellido es "+ alu2.getApellido());
        
        System.out.println("El codigo es"+ alu3.getId());
        System.out.println("El nombre es "+ alu3.getNombre());
        System.out.println("El apellido es "+ alu3.getApellido());
        
        alu1.setId(34);//sobre escribir 
        
        System.out.println("El codigo es"+ alu1.getId());
        System.out.println("El nombre es "+ alu1.getNombre());
        System.out.println("El apellido es "+ alu1.getApellido());
    }
    
}
