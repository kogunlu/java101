import java.util.Scanner;
public class KdvOdevi {

    public static void main(String[] args) {

        /* KDV Tutarı Hesaplayan Program
Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

(Not : KDV tutarını 18% olarak alın)

KDV'siz Fiyat = 10;

KDV'li Fiyat = 11.8;

KDV tutarı = 1.8;

Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız. */


        int tutar;
        double kdvOrani = 0.18, kdvTutari, kdvDahil;

        System.out.println("Lütfen tutar giriniz: ");
            Scanner input = new Scanner(System.in);
                tutar = input.nextInt();
                kdvTutari = tutar * kdvOrani;
        System.out.println("KDV tutarı: " + kdvTutari);
                kdvDahil = tutar + kdvTutari;
        System.out.println("KDV dahil fiyat: " + kdvDahil);







    }
}
