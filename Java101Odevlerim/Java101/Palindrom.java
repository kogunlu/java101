package Java101;

import java.util.Scanner;
public class Palindrom {
    static boolean isPalindrom(int number) {
        int temp, reverseNumber = 0, lastNumber;

        temp = number;

        while (temp != 0){

            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;

            temp /= 10;
        }

        if (number == reverseNumber){

            return true;

        } else {

            return false;

        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
            int number = input.nextInt();

        System.out.println(isPalindrom(number));

    }
}
