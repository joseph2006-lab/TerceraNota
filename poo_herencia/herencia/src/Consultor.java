
public class Consultor extends Persona {

    String cargo;
    String ocupacion;

    public Consultor() {
    }

    public Consultor(String cargo, String ocupacion, int id, String nombre, String apellido, int cedula) {
        super(id, nombre, apellido, cedula);
        this.cargo = cargo;
        this.ocupacion = ocupacion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

}
