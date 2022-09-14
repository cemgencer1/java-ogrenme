import java.util.Scanner;
public class ters_ucgen {
    public static void main (String[]args){
        int sayi;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        sayi = inp.nextInt();

        for (int i = sayi; i >= 1; i--){
            for (int k = 0; k <= sayi-i;k++){
                System.out.print(" ");
            }
            for (int d = 1; d <= ((2 * i) - 1); d++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
