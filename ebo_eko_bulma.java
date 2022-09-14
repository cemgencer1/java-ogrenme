import java.util.Scanner;
public class ebo_eko_bulma {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        int a,b,i;
        System.out.print("1. Sayıyı Giriniz :");
        int n1 = inp.nextInt();
        System.out.print("2.Sayıyı Girniz :");
        int n2 = inp.nextInt();
        int ebob = 1;
        if (n1<n2){
            a = n1 ;
            b = n2 ;
        }else {
            a = n2 ;
            b = n1 ;
        }
        for (i = 1; i <= a; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
        }
        for (int d=1;d<=(n1*n2);d++){
            if (d % a == 0 && d % b == 0 ) {
                System.out.println("EKOK :" + d);
                break;
            }
        }
        System.out.println("EBOB :"+ ebob);
    }
}
