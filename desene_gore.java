import java.util.Scanner;
public class desene_gore {
    static int say (int a){
        int sonuc=a;
        int b=a,c=0;
        do{
            System.out.print(sonuc+" ");
            sonuc=sonuc-5;
            c=c+1;
        }while (sonuc >-5);
        sonuc+=5;
        for (int i=0;i<(c-1);i++){
            sonuc+=5;
            System.out.print(sonuc+" ");
        }
        return sonuc;
    }
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz =");
        int a = scan.nextInt();
        say(a);
    }
}
