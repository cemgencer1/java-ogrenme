import java.util.Arrays;

public class dizi_siralama {
    public static void main(String[]args){
        int a=0;
        int[] dizi={34,54,-10,34,-10,-890};
        Arrays.sort(dizi);
        for (int i:dizi) {
            if (a==i){
                System.out.println(i + " Sayısı mükerrer sayıdır.");
            }
            a=i;
        }
    }
}
