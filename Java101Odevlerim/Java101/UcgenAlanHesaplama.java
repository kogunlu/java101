package Java101;

import java.util.Scanner;
public class UcgenAlanHesaplama {
    public static void main(String[] args) {
        /*Dik Üçgende Hipotenüs Bulan Program
Ödev
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

Formül
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

𝑢 = (a+b+c) / 2

Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)*/

        int a, b, c;
        double u, cevre, alan;
        Scanner input = new Scanner(System.in);

        System.out.print("1. Kenar uzunluğunu giriniz : ");
            a = input.nextInt();

        System.out.print("2. Kenar uzunluğunu giriniz : ");
            b = input.nextInt();

        System.out.print("3. Kenar uzunluğunu giriniz : ");
            c = input.nextInt();

        u = (a + b + c) / 2f;
            cevre = 2 * u;
            alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Üçgenin çevresi : " + cevre);
        System.out.print("Üçgenin alanı : " + alan);




    }
}
