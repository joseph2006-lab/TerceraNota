class principal{
    String nombre;
    public principal(String nombre){
        this.nombre=nombre;
    }
}

public class Persona2{

    public static void main(String[] args) {
        principal persona = new principal(null);
        persona.nombre = "Ana";
        cambiarNombre(persona);
        System.out.println("Nombre después de cambiarNombre: " + persona.nombre);  // Debería imprimir María
    }

    public static void cambiarNombre(principal persona) {
        persona.nombre = "María";
    }
}