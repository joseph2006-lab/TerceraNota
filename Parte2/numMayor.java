
public class numMayor {
    public static void main(String[] args) {
        int mayor = numeroMayor(10, 20, 5);
        System.out.println("El número mayor es: " + mayor);
    }

    public static int numeroMayor(int a, int b, int c) {
        if (a > b && a > c) { 
            return a;
        } else if (b > a && b > c) { 
            return b;
        } else {
            return c;
        }
    }
}

