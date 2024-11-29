public class fizzbuzz {
    public static void main(String[] args) {

        final int NUMERO_MAX = 100;

        for (int i = 1; i <= NUMERO_MAX; i++) {
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("fizzbuzz");
            }

            else if(i % 3 == 0 ){
                System.out.println("fizz");
                }
            else if(i % 5 == 0){
                System.out.println("buzz");

                }
            else if(i % 3 == 0 && i % 5 == 0){
                    System.out.println("fizzbuzz");
                }

            else {
                    System.out.println(i);
                }
        }

    }
}