import java.util.Scanner;
public class uc_ve_dorte_tam_bolunen_sayılarin_ortalamasi {
    public static void main (String[]args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz :");
        int sayi = inp.nextInt();
        int toplam=0,adet=0;
        for (int i =0;i<=sayi;i++){
            if (i % 3 == 0){
                if(i % 4 == 0){
                    System.out.println("Bu sayı 3'e ve 4'e tam bölünebiliyor ."+ i);
                    toplam += i;
                    adet ++;
                }

            }
        }
        double k =0;
        k =toplam / adet;
        System.out.println("3'e ve 4'e tam bölüne bilen sayı adeti :"+adet);
        System.out.println("Kurula uyan sayıların ortalaclesı :"+k);

    }
}
