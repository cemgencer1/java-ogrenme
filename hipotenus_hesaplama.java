import java.util.Scanner;

public class hipotenus_hesaplama {
    public static void main (String []args){
        int a,b;
        Scanner inp =new Scanner(System.in);
        System.out.print("Kısa Kenarı Girinniz :");
        a=inp.nextInt();
        System.out.print("Uzun Kenarı Giriniz :");
        b= inp.nextInt();
        double c = Math.sqrt((a*a)+(b*b));
        System.out.print("Hipotenüs :"+ c);

    }


}
