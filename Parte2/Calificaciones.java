public class Calificaciones {
    public static void main(String[] args) {
        // Declarar la matriz de calificaciones
        int[][] calificaciones = {
            {40, 50, 37, 28}, 
            {42, 41, 35, 39}, 
            {40, 42, 40, 34}  
        };

        // Mostrar las calificaciones
        System.out.println("Calificaciones:");
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Estudiante " + (i + 1) + ": ");
            for (int j = 0; j < calificaciones[i].length; j++) {
                System.out.print(calificaciones[i][j] + " ");
            }
            System.out.println();
        }

        // Calcular y mostrar el promedio por estudiante
        System.out.println("\nPromedio por estudiante:");
        for (int i = 0; i < calificaciones.length; i++) {
            int suma = 0;
            for (int j = 0; j < calificaciones[i].length; j++) {
                suma += calificaciones[i][j];
            }
            int promedio = suma / calificaciones[i].length;
            System.out.println("Estudiante " + (i + 1) + ": " + promedio);
        }

        // Calcular y mostrar el promedio por materia
        System.out.println("\nPromedio por materia:");
        for (int j = 0; j < calificaciones[0].length; j++) {
            int suma = 0;
            for (int i = 0; i < calificaciones.length; i++) {
                suma += calificaciones[i][j];
            }
            int promedio = suma / calificaciones.length;
            System.out.println("Materia " + (j + 1) + ": " + promedio);
        }
    }
}
