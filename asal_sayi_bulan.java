public class asal_sayi_bulan {
    public static void main(String[]args){
        int d=0;
        int sayac=0;
        int kat=0;
        for (int i=1; i <= 100; i++){
            for (int k = 2; k < i; k++){
                sayac=0;
                d= i%k;
                if (d == 0){
                    break;
                }
            }if (d!=0){
                System.out.print(i +",");
            }
        }
    }
}
