public class PromedioEstudiantes {
    public static void main(String[] args) {
        // Declarar la matriz de calificaciones
        int[][] calificaciones = {
            {40, 30, 48, 38}, 
            {42, 41, 50, 39}, 
            {40, 48, 20, 44},  
        };

        // Calcular y mostrar el promedio por estudiante
        System.out.println("Promedio por estudiante:");
        for (int i = 0; i < calificaciones.length; i++) {
            int suma = 0;
            for (int j = 0; j < calificaciones[i].length; j++) {
                suma += calificaciones[i][j]; // Sumar las calificaciones del estudiante
            }
            int promedio = suma / calificaciones[i].length; // Calcular el promedio
            System.out.println("Estudiante " + (i + 1) + ": " + promedio);
        }
    }
}
