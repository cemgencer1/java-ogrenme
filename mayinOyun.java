import java.util.Scanner;

public class mayinOyun {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Satir sayisi : ");
        int a = input.nextInt();
        System.out.print("Sutun sayisi : ");
        int b = input.nextInt();
        String[][] alan = mayinTarlasiBack.mayinTarlasiAlani(a, b);
        String[][] bosAlan = mayinTarlasiBack.bosAlan(a, b);
        mayinTarlasiBack.print(bosAlan);

//        MineSweeper.print(alan);

        mayinTarlasiBack.check(alan, bosAlan, a, b);
    }
}
