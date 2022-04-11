import java.util.Scanner;
public class TaksimetreOdevi {
    public static void main(String[] args) {

        /*Taksimetre Programı
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.*/


        int km, acilis;
        double i, yolUcreti, toplam;

        km = 1;
        acilis = 10;
        i = 2.2;

            Scanner input = new Scanner(System.in);
                System.out.print("Kaç km yol gittiğinizi giriniz: ");
                    km = input.nextInt();

        yolUcreti = km * i;
            toplam = acilis + yolUcreti;
        //Toplam 20'den küçükse değeri 20 yap, değilse toplam değişkeni ile devam et yazalım
                toplam = (toplam < 20) ? 20 : toplam;



        System.out.println("Taksimetre açılış fiyatı: " + acilis);
        System.out.println("Taksimetre ücreti (TL/km): " + i);
        System.out.println("Taksi ile gidilen mesafe (km): " + km);
        System.out.print("Taksimetre şu kadar TL yazdı: " + toplam);



    }



}
