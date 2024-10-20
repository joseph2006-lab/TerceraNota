
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner src = new Scanner(System.in);
        System.out.println("Ingrese si usted es Empleado/Consultor");
        String opcion = src.nextLine();
        opcion = opcion.toLowerCase();
        switch (opcion) {
            case "empleado":
                Obrero empleado1 = new Obrero();
                System.out.println("Ingrese el id: ");
                int id = src.nextInt();
                empleado1.getId();
                System.out.println("Ingrese su sueldo: $");
                empleado1.getSueldo();
                src.nextDouble();
                System.out.println("Ingrese su nombre: ");
                String nombre = src.nextLine();
                empleado1.getNombre();
                src.nextLine();
                System.out.println("Ingrese sus apellido: ");
                String apellido = src.nextLine();
                empleado1.getApellido();
                System.out.println("Ingrese su numero de cedula: ");
                int cedula = src.nextInt();
                empleado1.getCedula();
                src.nextLine();
                System.out.println("Ingrese su nacionalidad: ");
                String nacionalidad = src.nextLine();
                empleado1.getNacionalidad();
                break;
            case "consultor":
                Consultor consultor1 = new Consultor();
                System.out.println("Ingrese el id: ");
                id = src.nextInt();
                consultor1.getId();
                src.nextLine();
                System.out.println("Ingrese su nombre: ");
                nombre = src.nextLine();
                consultor1.getNombre();
                System.out.println("Ingrese sus apellido: ");
                apellido = src.nextLine();
                consultor1.getApellido();
                System.out.println("Ingrese su numero de cedula: ");
                cedula = src.nextInt();
                consultor1.getCedula();
                src.nextLine();
                System.out.println("Ingrese su cargo: ");
                String cargo = src.nextLine();
                consultor1.getCargo();
                System.out.println("Igrese su ocupacion: ");
                String ocupacion = src.nextLine();
                consultor1.getOcupacion();
                break;
            default:
                throw new AssertionError();
        }
        System.out.println("El registro terminó");
    }
}
