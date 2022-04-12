import java.util.Scanner;
public class VucutKitleEndeksi {
    public static void main(String[] args) {
        /*Vücut Kitle İndeksi Hesaplama
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

Formül
Kilo (kg) / Boy(m) * Boy(m)

Çıktısı
Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
Lütfen kilonuzu giriniz : 105
Vücut Kitle İndeksiniz : 35.49215792320173*/


        double boy, kilo, vIndex;
            Scanner input = new Scanner(System.in);

        System.out.print("Boyunuzu metre cinsinden giriniz (örn: 1.90): ");
            boy = input.nextDouble();

        System.out.print("Kilonuzu kilogram cinsinden giriniz (örn: 90): ");
            kilo = input.nextDouble();

        vIndex = kilo / (boy * boy);
            System.out.print("Vücut kitle endeksiniz: " + vIndex);




    }

}
