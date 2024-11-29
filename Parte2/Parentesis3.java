public class Parentesis3 {

    public static boolean esOrdenValido(String str) {
        int contador = 0; 

        
        for (char c : str.toCharArray()) {
            
            if (c == '(') {
                contador++;
            }
            
            else if (c == ')') {
                contador--;
                if (contador < 0) {
                    return false;
                }
            }
        }

        return contador == 0;
    }

    public static void main(String[] args) {
        // Ejemplos de prueba
        System.out.println(esOrdenValido("()"));              
        System.out.println(esOrdenValido(")(()()))"));        
        System.out.println(esOrdenValido("("));              
        System.out.println(esOrdenValido("(())((()())())"));  
    }
}

