public class minandMax {
    public static void main(String[]args) {
        int[] list = {32, 43, -65, 576, -899, 977};
        int min=list[0];
        int max=list[0];
        for (int i:list) {
            if (i<min){
                min=i;
            }
            if (i>max){
                max=i;
            }
        }
        System.out.println("minimum değer :" + min);
        System.out.println("maksimum değer :" + max);
    }

}
