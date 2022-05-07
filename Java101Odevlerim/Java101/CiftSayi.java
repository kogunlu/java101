package Java101;

import java.util.Scanner;
public class CiftSayi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sayi, i=1, sum=0, flag= 0 ;
        double avarage;

        System.out.print("Bir sayı giriniz: ");
            sayi = input.nextInt();

       while (i <= sayi){
           if(i % 12 == 0){
               System.out.println("12'ye bölünen sayılar: " + i);
               sum = sum + i;
               flag ++;
           }
           i++;
       }
            avarage = sum / flag;
            System.out.println("Ortalama: " + avarage);

    }
}
