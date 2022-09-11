import java.util.Scanner;
public class daire_hesaplama {
    public static void main (String [] args){
        int r;
        double pi=3.14,alan,cevre;
        Scanner inp=new Scanner(System.in);
         System.out.print("Yarıçapı Giriniz :");
         r =inp.nextInt();
         alan=pi*r*r;
         cevre=2*pi*r;
         System.out.println("Dairenin Alanı :"+alan);
         System.out.println("Dairenin Çevresi :"+cevre);


    }
}
