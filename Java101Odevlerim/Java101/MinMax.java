package Java101;

import java.util.Scanner;
public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz: ");
            int n = input.nextInt();
            int sayiMin = 0, sayiMax = 0;
            int k;


            for (int i = 1; i <= n; i++){

                System.out.print(i + ". sayıyı giriniz: ");
                    k = input.nextInt();

                    if(k < sayiMin){
                        sayiMin = k;
                    }
                    else if (k > sayiMax){
                        sayiMax = k;

                    }

            }
        System.out.println("En büyük sayı: " + sayiMax);
        System.out.println();
        System.out.println("En küçük sayı: " + sayiMin);




    }
}
