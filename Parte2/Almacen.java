public class Almacen {
    public static void main(String[] args) {
        System.out.println("Bienvenido a Koaj");

        byte tshirt = 25; 
        byte pants = 30;
        double sale15 = 0.85; 
        double sale5 = 0.95;  

        double salepants = pants * sale15;
        double saletshirt = tshirt * sale5; 

        double totalsale = salepants + saletshirt;
        System.out.println("El precio con descuento de los pantalones es: " + salepants);
        System.out.println("El precio con descuento de la camiseta es: " + saletshirt);
        System.out.println("El precio total con descuento es: " + totalsale);
    }
}

