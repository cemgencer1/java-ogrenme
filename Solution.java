
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args)  {
        Scanner inp=new Scanner(System.in);
        int result=0,result2=0;

       int[] dizi = new int[5];
        for(int i=0; i<dizi.length; i++)
        {
            dizi[i]= inp.nextInt();
        }
        Arrays.sort(dizi);
        for (int i=0;i<dizi.length-1;i++) {
            result+=dizi[i];
        }
        for (int i=1;i<dizi.length;i++) {
            result2+=dizi[i];
        }
        System.out.println(result+" "+result2);
    }
}
