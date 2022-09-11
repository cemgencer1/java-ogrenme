import java.util.Scanner;
public class vucut_kitle_indeksi {
    public static void main(String []args){
        double boy,indeks;
        int kilo;
        Scanner inp=new Scanner(System.in);

        System.out.print("Lütfen Boyunuzu Metre Cinsinden Giriniz :");
        boy=inp.nextDouble();
        System.out.print("Lütfen kilonuzu Giriniz :");
        kilo=inp.nextInt();

        indeks = (kilo/(boy*boy));
        System.out.print("Vücut Kitle İndeksiiniz :"+indeks);
    }
}
