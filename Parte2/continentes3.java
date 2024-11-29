import java.util.Scanner;
class Continentes{
    String[]conti;
    public Continentes(String[]conti){
        this.conti=conti;
    }
}
class Contador{
    int valor;
    public Contador(int valor){
        this.valor=valor;
    }
    public void incrementar(){
        valor ++;
    }
}
class asistentes{
    String primerNombre;
    String segundoNombre;
    String pais;
    String continente;
    String lenguaje;
    boolean cumplimiento;
    int edad;
    public asistentes( String primerNombre, String segundoNombre, String pais, String continente, String lenguaje, int edad, boolean cumplimiento){
        this.primerNombre=primerNombre;
        this.segundoNombre=segundoNombre;
        this.pais=pais;
        this.continente=continente;
        this.lenguaje=lenguaje;
        this.cumplimiento=cumplimiento;
        this.edad=edad;
    }
    public void mostrar() {
        System.out.println("Primer nombre : "+primerNombre);
        System.out.println("Segundo nombre : "+segundoNombre);
        System.out.println("Pais : "+pais);
        System.out.println("Continete : "+continente);
        System.out.println("lenguaje : "+lenguaje);
        System.out.println("edad : "+edad);
        System.out.println("Estan todos los continentes? "+cumplimiento);
    }
    public void cambiarDatos(Scanner sc, Contador contador,Continentes continent) {
            
            System.out.println("Tu primer nombre es");
            String nombre1=sc.nextLine();
            this.primerNombre=nombre1;
            System.out.println("Tu segundo nombre es");
            String segundoNombre1=sc.nextLine();
            this.segundoNombre=segundoNombre1;
            System.out.println("Tu pais es");
            String pais1=sc.nextLine();
            this.pais=pais1;
            System.out.println("Tu continente es");
            String continente1=sc.nextLine();
            this.continente=continente1;
                for(int i=0; i<continent.conti.length;i++){
                    if (continente1.equals(continent.conti[i])){
                        continent.conti[i]=null;
                        contador.incrementar();
                    }
                }
            if(continent.conti[0]==null && continent.conti[1]==null && continent.conti[2]==null && continent.conti[3]==null && continent.conti[4]==null && continent.conti[5]==null){
                this.cumplimiento=true;
            }
    }
}
public class continentes3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        asistentes n=new asistentes(null, null, null, null, null, 0, false);
        Contador contador=new Contador(0);
        String[] continents={"America del sur","America del norte","Asia","Africa","Europa","oceania"};
        Continentes continent=new Continentes(continents);
        for(int x=1;x<=6;x++){
            System.out.println("ASISTENTE NUMERO "+x);
            n.cambiarDatos(sc,contador,continent);
            n.mostrar();
        }
        
    }
}