import java.util.Scanner;
public class kdv_hesaplama {
    public static void main (String [] args)
    {
        double tutar,kdvOran = 0.18;
        Scanner inp = new Scanner(System.in);
        System.out.print("Hesaplanacak Tutarı Giriniz :");
        tutar =inp.nextDouble();
        double kdvTutar = tutar * kdvOran;
        System.out.println("Kdv Tutarı :"+ kdvTutar);
        System.out.print("Toplam Tutar :"+(tutar+kdvTutar));

    }
}
