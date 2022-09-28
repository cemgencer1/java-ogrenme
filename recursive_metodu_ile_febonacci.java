import java.util.Scanner;
public class recursive_metodu_ile_febonacci {
    static int fib (int n){
        if (n == 1 || n == 2){
            return 1;
        }
        return fib(n-1) + (n-2);
    }
    public static void main (String[]args){
        System.out.println(fib(5));
    }
}
