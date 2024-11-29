class Persona {
    String nombre;
}

public class referencia {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.nombre = "Tatiana";
        cambiarPersona(persona);
        System.out.println("Después de cambiarPersona: " + persona.nombre);  
    }

    public static void cambiarPersona(Persona persona) {
        persona = new Persona();
        persona.nombre = "Sofia";
        System.out.println("Dentro de cambiarPersona: " + persona.nombre); 
    }
}
