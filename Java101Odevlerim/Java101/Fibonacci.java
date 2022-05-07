package Java101;

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
            int n = input.nextInt();
            int toplam = 0;
            int geciciToplam= 0;
            int yeniToplam =0;

            for (int i = 0; i <= n; i++){

                geciciToplam = toplam;
                toplam = yeniToplam;

                if (yeniToplam == 0){
                    yeniToplam += 1;

                    System.out.print("0 ");
                    System.out.print(yeniToplam + " ");

                }else{
                    yeniToplam = toplam + geciciToplam;
                    System.out.print(yeniToplam + " ");


                }



            }




    }
}
