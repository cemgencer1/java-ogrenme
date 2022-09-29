import java.util.Scanner;
public class us_alma {
    static int us(int a, int b){
        int result=1;
        for (int i=1; i<=b; i++){
            result *= a;
        }
        System.out.println("Sonuç =" + result);
        return result;
    }
    public static void main (String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Taban Sayısını Giriniz =");
        int a=scan.nextInt();
        System.out.print("Üs Sayısını Giriniz =");
        int b= scan.nextInt();
        us(a,b);
    }
}
