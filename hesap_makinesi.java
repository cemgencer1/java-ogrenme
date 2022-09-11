import java.util.Scanner;
public class hesap_makinesi {
    public static void main (String[]args){
        int n1,n2,secim;
        Scanner inp=new Scanner(System.in);

        System.out.print("1.Sayıyı Giriniz :");
        n1=inp.nextInt();
        System.out.print("2.Sayıyı Giriniz :");
        n2=inp.nextInt();
        System.out.print("1.Toplama\n2.Çıkarma\n3.Çarpma\n4.Bölme\n");
        System.out.print("Lütfen Seçiminizi Yapınız :");
        secim =inp.nextInt();
        switch (secim){
            case 1:
                System.out.print("Toplama İşlemi Sonucu :"+(n1+n2));
                break;
            case 2:
                System.out.print("Çıkarma İşlemi Sonucu :"+(n1-n2));
                break;
            case 3:
                System.out.print("Çarpma İşlemi Sonucu :"+(n1*n2));
                break;
            case 4:
                if (n2!=0){
                System.out.print("Bölme İşlemi Sonucu :"+(n1/n2));
                break;}
                else{
                System.out.print("Bölme İşleminde 0 a Bölünemez");
                }
                break;
            default:
                System.out.print("Yanlış Seçim Yaptınız.");
        }
    }
}
