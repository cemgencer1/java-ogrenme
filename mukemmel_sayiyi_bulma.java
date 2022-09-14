import java.util.Scanner;
public class mukemmel_sayiyi_bulma {
    public static void main (String[]args){
        int sayi,toplam=0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz :");
        sayi = inp.nextInt();
        for (int i = 1; i < sayi; i ++ ){
            if ( sayi % i == 0 ){
                toplam += i;
            }
        }
        if (sayi == toplam){
            System.out.print("Girilen Sayı Mükemmel Sayıdır.");
        }else {
            System.out.print("Girilen Sayı Mükemmel Sayı Değildir.");
        }
    }
}
