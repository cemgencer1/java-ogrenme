import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class sayi_tahmini{
    public static void main(String[]args){
        Random rand =new Random();
        int number= rand.nextInt(100);
        Scanner inp=new Scanner(System.in);
        int right=0;
        int selected;
        int[] wrong = new int[5];

        System.out.println(number);
        while (right<5) {
            System.out.println("===================");
            System.out.print("Tahmininizi Giriniz :");
            selected = inp.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Kriterlere uygun sayı girmediniz.");
                continue;
            }
            if (number == selected) {
                System.out.println("Tebrikler Doğru Tahmin Ettiniz.Sayı = " + number);
                break;
            } else {
                System.out.println("Hatalı Sayı Girdiniz .");
            }
            if (number < selected) {
                System.out.println("Girdiğiniz sayı tahmin edilecek sayıdan büyüktür.");
            } else {
                System.out.println("Girdiğiniz sayı tahmin edilecek sayıdan küçüktür.");
            }
            wrong [right++]=selected;
            int a = 5-right;
            System.out.println("Tahmin etme hakkınız = " + (a));
            System.out.println("Tahmin ettiğiniz sayılar : " + Arrays.toString(wrong));
            if (a==0){
                System.out.println("Hakkınız kalmadı Kaybettiniz");
            }
        }
    }
}
