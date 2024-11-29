
public class aumetar3 {

    public static void main(String[] args) {
        int a = 0;
        System.out.println("Antes de llamar al metodo: x = " + a);
        a = aumentado(a);
        System.out.println("Despues de llamar al metodo: x = " + a);
    }

    public static int aumentado(int a) {
        ++a;
        System.out.println("Dentro del metodo: x = " + a);
        return a;
    }
}
