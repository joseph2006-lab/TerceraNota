
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class claseTxt {

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.println("Ingrese el codigo del alumno:");
        int codigo = src.nextInt();

        src.nextLine();

        System.out.println("Ingrese el nombre del primer alumno:");
        String nombre = src.nextLine();

        System.out.println("Ingres el apellido del alumno:");
        String apellido = src.nextLine();

        Persona alumno1 = new Persona(codigo, nombre, apellido);

        try {
            FileWriter fileWriter = new FileWriter("Lista alumnos.txt", true);// se crea el archivo
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);// se llena el archivo
            bufferedWriter.newLine();
            bufferedWriter.write("-----------------------------------");
            bufferedWriter.newLine();
            bufferedWriter.write(alumno1.toString());// se guarda el objeto alumno1
            bufferedWriter.close();// cerrar para guardar cambios
            System.out.println("La informacion se a guardado correctamente");
        } catch (IOException e) {
            System.out.println("No se pudo guardar");
            e.printStackTrace();
        }
    }
}
