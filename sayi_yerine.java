import java.util.Scanner;
public class sayi_yerine {
        public static void main(String [] args) {
            int sayi,kalanuc,kalanbes;
            String str;
            Scanner inp=new Scanner (System.in);
            System.out.print("Sayı Giriniz :");
            sayi= inp.nextInt();
            System.out.print("Sayı Giriniz :");
            str=inp.nextLine();
            if (sayi >= 1){
                for (int i=1;i<=sayi;i++){
                    kalanuc = i%3;
                    kalanbes = i % 5;
                    if ((kalanuc==0)&&(kalanbes==0)){
                        System.out.println("FizzBuzz");
                    }else if(kalanuc==0){
                        System.out.println("Fizz");
                    }else if(kalanbes==0){
                        System.out.println("Buzz");
                    }else{
                        System.out.println(i);
                    }
                }
            }else {
                System.out.println("Geçersiz Sayı Girdiniz !!!");
            }
            System.out.println(str);
        }

    }

