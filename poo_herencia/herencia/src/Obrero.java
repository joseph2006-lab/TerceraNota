
public class Obrero extends Persona {

    String nacionalidad;
    double sueldo;

    public Obrero() {
    }

    public Obrero(String nacionalida, double sueldo, int id, String nombre, String apellido, int cedula) {
        super(id, nombre, apellido, cedula);
        this.nacionalidad = nacionalida;
        this.sueldo = sueldo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

}
