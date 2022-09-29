import java.util.Scanner;
public class asal_sayi {
    static int asal(int a){
        int result =1;
        int son=0;
        for (int i=1;i<=a;i++) {
            result =a%i;
            if (result == 0) {
                son++;
            }
        }
            if (son!=2){
                System.out.println("Asal Sayı Değil");
            }else{
                System.out.println("Asal Sayı");
            }
return result;
    }
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı Giriniz =");
        int a = scan.nextInt();
        asal(a);
    }
}
