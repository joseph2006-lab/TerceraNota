public class modificarArray3{
    public static void main(String[] args) {
        int[] holi = {1,3};
        System.out.println(holi[0] +" "+holi[1]);
        modificarArray(holi);
        System.out.println(holi[0] +" "+holi[1]);
    }

    public static void modificarArray(int[] arr){
        arr[0]=0;
        arr[1]=0;
    }
}

