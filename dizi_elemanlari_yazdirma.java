import java.util.Arrays;

public class dizi_elemanlari_yazdirma {
    public static void main(String[]args){
        int k=1;
        int[] dizi ={32,-45,98,76,98,103};
        System.out.println("Dizinin Boyutu n :" + dizi.length);
        for (int i:dizi) {
            System.out.println(k + ". Elemanı :" + i);
            k+=1;
        }
        Arrays.sort(dizi);
        System.out.print("Sıralama :");
        for (int s:dizi) {
            System.out.print( s +" ");
        }
    }
}
