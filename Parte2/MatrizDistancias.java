public class MatrizDistancias {
    public static void main(String[] args) {
        // Matriz de distancias entre ciudades
        int[][] distancias = {
            {0, 10, 15, 20},
            {10, 0, 35, 25},
            {15, 35, 0, 30},
            {20, 25, 30, 0}
        };

        // Mostrar la matriz de distancias
        System.out.println("Matriz de distancias:");
        for (int i = 0; i < distancias.length; i++) {
            for (int j = 0; j < distancias[i].length; j++) {
                System.out.print(distancias[i][j] + "\t");
            }
            System.out.println();
        }

        // Ejemplo de recorrido: Ciudad 0 → Ciudad 2 → Ciudad 3 → Ciudad 1
        int[] recorrido = {0, 2, 3, 1};
        int distanciaTotal = calcularDistanciaTotal(distancias, recorrido);

        // Mostrar el resultado del recorrido
        System.out.println("\nRecorrido: Ciudad 0 → Ciudad 2 → Ciudad 3 → Ciudad 1");
        System.out.println("Distancia total del recorrido: " + distanciaTotal + " unidades");
    }

    // Método para calcular la distancia total de un recorrido dado
    public static int calcularDistanciaTotal(int[][] distancias, int[] recorrido) {
        int total = 0;
        for (int i = 0; i < recorrido.length - 1; i++) {
            int ciudadActual = recorrido[i];
            int ciudadSiguiente = recorrido[i + 1];
            total += distancias[ciudadActual][ciudadSiguiente];
        }
        return total;
    }
}
