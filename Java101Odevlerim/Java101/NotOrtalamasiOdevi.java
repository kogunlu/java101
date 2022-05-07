package Java101;

import java.util.Scanner;

public class NotOrtalamasiOdevi {
    public static void main(String[] args) {

        /* Not Ortalaması Hesaplayan Program
Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

Ödev
Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

Not : If ve Else kullanılmayacak... */

        //Dersleri tanımlıyoruz.
         int m1, f1, k1, t1, ta1, mu1;

        //Kullanıcıdan alınacak notları tutmak için scanner sınıfı ile nesne tanımlıyoruz.
          Scanner input = new Scanner(System.in);

        //Kullanıcıdan giriş yapmasını isteyelim.
            System.out.println("Sırasıyla Matematik, Fizik, Kimya, Türkçe, Tarih ve Müzik derslerininin sınavlarından aldığınız notları girin :");
            m1 = input.nextInt();
            f1 = input.nextInt();
            k1 = input.nextInt();
            t1 = input.nextInt();
            ta1 = input.nextInt();
            mu1 = input.nextInt();

        //Girilen notların ortalaması hesaplanacak. Değişken tanımlıyıp işlem yapmaya başlıyoruz.
        //Bölme işlemi olduğu ve küsürat çıkabileceği için double ile tanımlıyoruz.
            double sonuc = (m1 + f1 + k1 + t1 + ta1 + mu1 ) / 6.0;

        System.out.println("Ortalamanız = " + sonuc);

        //Sonucun 60'tan büyük mü küçük mü olduğunu sınamak için boolean tanımladım.
        boolean kosul1 = sonuc >= 60;
        String str = kosul1 ? "Sınfı geçtiniz!" : "Sınıfta kaldınız.";

        System.out.println(str);







    }
}
