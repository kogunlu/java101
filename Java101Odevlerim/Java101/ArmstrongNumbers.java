package Java101;

import java.util.Scanner;
public class ArmstrongNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int basSayisi = 0;
        int basDeger ;
        int sum = 0;


        System.out.print("Bir sayı giriniz: ");
        int x = input.nextInt();
        int tempx = x;

        while (tempx != 0) {

            tempx = tempx / 10;
            basSayisi++;

        }
        System.out.println(basSayisi + "---> Kaç basamak var");

        tempx = x;



        while (tempx != 0) {

            basDeger = tempx % 10;

            System.out.println( basDeger + "----> üssü alınacak olan rakam");

            int basPow = 1;

            for (int i = 1; i <= basSayisi; i++) {

                basPow = basPow * basDeger;

                System.out.println(basPow);
            }
            System.out.println("Rakamın üssünün alınması sonrası sonuc: " + basPow);

            sum = sum + basPow;
            tempx = tempx /10;

        }
        System.out.println("Rakamların, hane sayısı kadar üssünün alındıktan sonra toplanması= " + sum);

        if (sum == x){
            System.out.println("Girdiğiniz sayı bir Armstrong sayısıdır");
        } else {
            System.out.println("Girdiğiniz sayı Armstrong sayısı değildir.");
        }
        System.out.println("Program bitti.");
    }
}














/*  Takip edilecek adamlar;
    1- Girilen sayının kaç basamaklı olduğunu bul
    2- Girilen sayının her basamadığındaki değeri bul (10'a bölümünden kalan)
    3-Bu değerleri, basamak sayısı kadar üs al.
    4-Bu değerleri topla ve sayıya eşit mi kontrol et
    5-Çıktı yazdır
 */

