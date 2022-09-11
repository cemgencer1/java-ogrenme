import java.util.Scanner;
public class taksimetre {
    public static void main(String []args){
        int km;
        double perKm=2.20,toplam=10;

        Scanner inp = new Scanner(System.in);

        System.out.print("Gidilecek Mesafe'yi Giriniz :");
        km =inp.nextInt();

        toplam +=(km*perKm);
        toplam = (toplam < 20) ? 20 : toplam;
        System.out.print("Toplam Taksimetre Tutarı :"+toplam);


    }
}
