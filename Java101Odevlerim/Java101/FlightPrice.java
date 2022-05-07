package Java101;

import java.util.Scanner;
public class FlightPrice {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int distance, age, type = 0;
        double  sumPrice = 0,sumTotal=0, price = 0.10;

        System.out.println("Uçak bileti fiyatını hesaplayan program");
        System.out.print("Uçuş mesafenizi giriniz (km): ");
            distance = inp.nextInt();
                if(distance >= 0){
                    sumPrice = distance * price;
                }else{
                    System.out.println("Hatalı Veri Girdiniz!\nUçuş mesafesi negatif olamaz. Programı yeniden " +
                            "başlatarak tekrar giriş yapın.");
                }

        System.out.print("Yaşınız: ");
            age = inp.nextInt();
                if ((age >= 1) && (age < 12)){
                    System.out.println("Çocuk kategorisi\n%50 indirim uygulanacak." );
                    sumTotal = sumPrice / 2;

                }else if ( (age >= 12) && (age < 24)){
                    System.out.println("Genç kategorisi\n%10 indirim uygulanacak.");
                    sumTotal = sumPrice * 0.9;

                }else if (age >= 65){
                    System.out.println("Yaşlı kategorisi\n%30 indirim uygulanacak.");
                    sumTotal = sumPrice * 0.7;
                }else if (age <= 0){
                    System.out.println("Hatalı Veri Girdiniz!\nYaşınız 0 veya negatif olamaz.Programı yeniden başlatarak tekrar giriş yapın.");
                }else{
                    sumTotal = sumPrice;
                }
        System.out.println("Yolculuk tipini seçiniz\n1-Tek Yön\n2-Gidiş - Geliş");
                type = inp.nextInt();

                if (type==2){
                    sumTotal = (sumTotal *2) * 0.8;

                }else if ((type < 1) || (type > 2)){
                    System.out.println("Hatalı giriş yaptınız.");
                }
        System.out.println("Bilet fiyatınız: " + sumTotal);


    }
}
