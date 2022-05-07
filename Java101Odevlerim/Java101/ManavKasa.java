package Java101;

import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {
        /*Manav Kasa Programı
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
Örnek Çıktı;

Armut Kaç Kilo ? :0
Elma Kaç Kilo ? :1
Domates Kaç Kilo ? :1
Muz Kaç Kilo ? :2
Patlıcan Kaç Kilo ? :3
Toplam Tutar : 21.68 TL*/

        double fArmut = 2.14, fElma = 3.67, fDomates = 1.11 , fMuz = 0.95, fPatlican = 5.0;
        double kA, kE, kD, kM, kP, toplam;
        Scanner input = new Scanner(System.in);

        System.out.println("Manavdan aldığınız ürünlerin ağırlıklarını giriniz (kg cinsinden) ");
        System.out.print("Armut :" );
            kA = input.nextDouble();
        System.out.print("Elma :");
            kE = input.nextDouble();
        System.out.print("Domates :");
            kD = input.nextDouble();
        System.out.print("Muz : ");
            kM  = input.nextDouble();
        System.out.print("Patlıcan :");
            kP = input.nextDouble();

        toplam = (fArmut*kA) + (fElma*kE) + (fDomates*kD) + (fMuz*kM) + (fPatlican*kP);

        System.out.println("Armut kaç kilo: " + kA);
        System.out.println("Elma kaç kilo: " + kE);
        System.out.println("Domates kaç kilo: " + kD);
        System.out.println("Muz kaç kilo: " + kM);
        System.out.println("Patlıcan kaç kilo: " +kP);
        System.out.println("Toplam tutar: " + toplam + "TL");








    }
}
