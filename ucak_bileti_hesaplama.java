import java.util.Scanner;

public class ucak_bileti_hesaplama {
    public static void main(String[]args){
        int tur,yas,mesafe;
        double tutar,indirim;

        Scanner inp =new Scanner(System.in);

        System.out.print("1.Gidiş\n2.Gidiş Dönüş\nSeyahat Türünü Giriniz :");
        tur = inp.nextInt();
        System.out.print("Yaşınızı Giriniz :");
        yas = inp.nextInt();
        System.out.print("Mesafeyi KM Cinsincen Giriniz :");
        mesafe =inp.nextInt();
        tutar = mesafe*0.10;
        System.out.println("Normal Tutar :" +tutar);
        switch (tur){
            case 1:
                if (yas<12){
                    indirim = tutar*0.50;
                    tutar-=indirim;
                    System.out.print("İndirimli Tutar :"+tutar);
                }else if ((yas>=12)&&(yas<=24)){
                    indirim=tutar*0.10;
                    tutar-=indirim;
                    System.out.print("İndirimli Tutar :"+tutar);
            }   else if (yas>=65){
                    indirim=tutar*0.30;
                    tutar-=indirim;
                    System.out.print("İndirimli Tutar :"+tutar);
            }   else {
                    System.out.print("İndirim Kazanamadınız.Tutar :"+tutar);
            }break;
            case 2:
                indirim = tutar*0.20;
                tutar-=indirim;
                System.out.print("İndirimli Tutar :"+tutar);
                break;
            default:
                System.out.print("Hatalı Giriş Yaptınız!");
        }
    }
}
