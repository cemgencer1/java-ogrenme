import java.util.Scanner;
public class atm_projesi {
    public static void main (String[]args){
        String kullaniciAdi,sifre;
        Scanner inp =new Scanner(System.in);
        int hak = 3 ;
        int bakiye =1500;
        int secim;
        while (hak > 0 ) {
            System.out.print("Kullanıcı Adınız :");
            kullaniciAdi = inp.nextLine();
            System.out.print("Parolanızı Giriniz :");
            sifre = inp.nextLine();
            if (kullaniciAdi.equals("lugat") && sifre.equals("lugat123")){
                System.out.println("Sisteme Giriş Yaptınız");
                do {
                    System.out.println("1-Para Yatırma\n2-Para Çekme\n3-Bakiye Görüntüleme\n4-Çıkış");
                    System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçiniz :");
                    secim = inp.nextInt();
                    if (secim==1){
                        System.out.print("Yatırılacak Para Miktarını Giriniz :");
                        int yatirilan = inp.nextInt();
                        bakiye += yatirilan;
                        System.out.println("Yeni Bakiyeniz :" + bakiye);
                    }else if (secim == 2){
                        System.out.print("Çekilecek Para Miktarını Giriniz :");
                        int cekilen = inp.nextInt();
                        if(bakiye<cekilen){
                            System.out.println("Bakiye yetersiz:Bu İşlemi Yapamazsınız.");
                        }else {
                            bakiye -= cekilen;
                            System.out.println("Yeni Bakiyeniz :" + bakiye);
                        }
                    }else if (secim == 3){
                        System.out.println("Bakiyeniz :" + bakiye);
                    }
                }while (secim!=4);
                    break;
            }else{
                hak --;
                System.out.println("Hatlı Şifre veya Parola Girdiniz.Lütfen Tekrar Deneyiniz. ");
                if (hak == 0){
                    System.out.println("Hesabınız bloke olmustur.Lütfen bankanız ile iletişime geçiniz.");
                }else {
                    System.out.println("Kalan Deneme Sayınız :" + hak);
                }
            }
        }

    }
}
