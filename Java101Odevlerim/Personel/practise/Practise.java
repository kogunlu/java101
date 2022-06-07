package Personel.practise;

import java.util.Scanner;

public class Practise {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
            int x = input.nextInt();

            int sum = 0;

            while(x > 1){
                sum += ( x % 10);
                x = x /10;
            }

        System.out.println(sum );
    }
}
