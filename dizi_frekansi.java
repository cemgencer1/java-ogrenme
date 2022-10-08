import java.util.Arrays;
public class dizi_frekansi {
    public static void main(String[]args){
        int k=0,s=0;
        int[] dizi={20,15,252,20,15,15,20,252,20,675};
        Arrays.sort(dizi);
        k=dizi[0];
        System.out.println("Tekrar Sayıları");
        for (int i:dizi) {
            if (k==i){
                s+=1;
            }
            if(k!=i){
                System.out.println(k + " Sayısı " + s + " kere tekrar edildi.");
                s=1;
            }
            k=i;
        }
    }
}
