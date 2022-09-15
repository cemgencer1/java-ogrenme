import java.util.Scanner;
public class fibonacci {
    public static void main(String[]args){
        int a;
        int b=0,c=1,d=0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç Adet Fibonacci Sayısı hesaplamak İstiyorsanız Giriniz :");
        a= inp.nextInt();
        for ( int i=0; i < a; i ++){
          d=b+c;
          System.out.println(b+"+"+c+"="+d);
          b=c;
          c=d;
        }
    }
}
