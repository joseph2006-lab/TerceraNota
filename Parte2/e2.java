public class e2 {
    public static void main(String[] args) {
        
      int evenCount = 0;
      
      for(int x = 1; x<=100; x++){
        if(x % 2 == 0){
            evenCount++;
        }
      }
      System.out.println("la cantidad de numeros pares del 1 al 100 es: " + evenCount);
    }
}
