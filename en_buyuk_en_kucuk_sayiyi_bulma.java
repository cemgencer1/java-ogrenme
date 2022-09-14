import java.util.Scanner;
public class en_buyuk_en_kucuk_sayiyi_bulma {
    public static void main (String[]args){
        int sayi;
        int min = 0 , max = 0 ;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kaç Adet Sayı Gireceksiniz :");
        sayi = inp.nextInt();
        for (int d = 1; d <= sayi; d++){
            System.out.print( d + ".Sayıyı Giriniz :");
            int k = inp.nextInt();
            if (d == 1) {
                min = k ;
                max = k ;
            } else {
                if (k > max) {
                    max = k ;
                }else if (k < min) {
                    min = k ;
                }
            }
        }
        System.out.println("En Büyük Sayı :" + max);
        System.out.println("En Küçük Sayı :" + min);
    }
}
