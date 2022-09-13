import java.util.Scanner;

public class kullanici_girisi {
    public static void main (String[]args){
        String userName,password;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınızı Giriniz :");
        userName= inp.nextLine();

        System.out.print("Parolanızı Giriniz :");
        password=inp.nextLine();

        if (userName.equals("Patika") && password.equals("java123")){
            System.out.print("Sisteme Giriş Yaptınız.");
        }else {
            System.out.print("Hatalı Giriş Yaptınız !");
        }
    }
}
