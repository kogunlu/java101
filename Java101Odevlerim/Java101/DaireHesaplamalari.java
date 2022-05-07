package Java101;

import java.util.Scanner;
public class DaireHesaplamalari {
    public static void main(String[] args) {

        /*Dairenin Alanını ve Çevresini Hesaplayan Program
Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

Alan Formülü : π * r * r;

Çevre Formülü : 2 * π * r;

Ödev
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

𝜋 sayısını = 3.14 alınız.

Formül : (𝜋 * (r*r) * 𝛼) / 360*/

int r;
double  pi, alan, cevre, a, alanDilim;
    pi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.print("Çemberin yarı çapını girin: ");
        r = input.nextInt();


alan = pi * (r * r);
cevre = 2 * pi * r;


        System.out.println("r = " + r);
        System.out.println("Alan = " + alan);
        System.out.println("Çevre = " + cevre) ;

        System.out.print("Alanını hesaplamak istediğiniz dilime ait merkez açıyı girin: ");
        a = input.nextDouble();
            alanDilim = (pi * (r*r) * a) / 360;


        System.out.println("Girdiğiniz açıya ait dilimin alanı = " + alanDilim);













    }




}
