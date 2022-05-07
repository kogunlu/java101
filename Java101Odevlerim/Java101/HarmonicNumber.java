package Java101;

import java.util.Scanner;
public class HarmonicNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int n, i=1;
        double result=0;

        System.out.print("Bir sayı giriniz: ");
            n = input.nextInt();

            while (i <= n){

                result = result + (1.0 / i);

                i++;

            }
        System.out.println(result);



    }
}
