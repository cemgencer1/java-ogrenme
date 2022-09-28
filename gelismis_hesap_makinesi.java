import java.util.Scanner;

public class gelismis_hesap_makinesi {
    static int sum (int a , int b){
        int result = a + b ;
        System.out.println("Sonuç =" + result);
        return result ;
    }
    static int minus (int a , int b){
        int result = a - b ;
        System.out.println("Sonuç =" + result);
        return result;
    }
    static int carpma (int a , int b){
        int result = a * b ;
        System.out.println("Sonuc =" + result);
        return result;
    }
    static int bolme (int a , int b){
        if (b==0){
            return 0;
        }
        int result = a / b;
        System.out.println("Sonuç =" + result);
        return result;
    }
    static int usAlma (int a , int b){
        int result = 1 ;
        for ( int i =1 ; i <= b ;i++){
            result *= a;
        }
        System.out.println("Sonuç =" + result);
        return result;
    }
    static int modAlma (int a , int b){
        int result = a % b;
        System.out.println("Sonuç =" + result);
        return result;
    }
    static void dikdortgen(int a, int b){
        System.out.println("Çevresi =" + (2*(a+b)));
        System.out.println("Alanı =" + (a*b));
    }
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1.Toplama İşlemi\n"
                +"2. Çıkarma İşlemi\n"
                +"3. Çarpma İşlemi\n"
                +"4. Bölme İşlemi\n"
                +"5. Üslü Sayı Hesaplama\n"
                +"6. Mod Alma\n"
                +"7. Dikdörtgen Alan ve Çevre Hesaplama\n"
                +"0. Çıkış";
        while (true){
            System.out.println(menu);
            System.out.print("Yapmak İstediğiniz İşlemi Seçiniz =");
            select = scan.nextInt();
            if (select == 0 ){
                break;
            }
            System.out.print("1.Sayıyı Giriniz :");
            int a = scan.nextInt();
            System.out.print("2.Sayıyı Giriniz :");
            int b = scan.nextInt();
            switch (select){
                case 1:
                    sum(a , b);
                    break;
                case 2:
                    minus (a , b );
                    break;
                case 3:
                    carpma(a , b);
                    break;
                case 4 :
                    if (bolme(a,b)==0){
                        System.out.println("İkinci Sayı 0 Olamaz.");
                    }
                    bolme(a , b);
                    break;
                case 5:
                    usAlma(a,b);
                    break;
                case 6:
                    modAlma(a , b);
                    break;
                case 7:
                    dikdortgen (a , b);
                    break;
                default:
                    System.out.println("Geçersiz İşlem Girdiniz .");
            }

        }

    }
}
