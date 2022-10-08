public class dizi_ortalama {
    public static void main (String[]args){
        int[] dizi={456,5665,787,644,232};
        double toplama =0.0;
        for (int i=0; i < dizi.length; i++){
            toplama += dizi[i];
        }
        double ortalama = toplama/dizi.length;
        System.out.println("Dizi Ortalama :"+ortalama);
    }
}
