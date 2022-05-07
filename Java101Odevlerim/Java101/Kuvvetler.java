package Java101;

import java.util.Scanner;
public class Kuvvetler {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
            int i, k;

        System.out.print("Bir sayı giriniz: ");
            k = input.nextInt();

        System.out.println("------------------");
        System.out.println(k +" sayısına kadar 4 ün kuvvetleri:");

        for (i=1; i<k; i=i*4){
            System.out.println(i);
        }
        System.out.println("-----------------");
        System.out.println(k + " sayısına kadar 5 in kuvvetleri:");

        for (i=1; i<k; i=i*5){
            System.out.println(i);
        }
        System.out.println("-----------------");
        System.out.println("Program bitti.");
    }
}
