package Java101;

import java.util.Scanner;
public class SicaklikEtkinlik {
    public static void main(String[] args) {
        /*Koşullar :

Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
Ödev
Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.*/

        int hava;
        Scanner input = new Scanner(System.in);

        System.out.println("Etkinlik planladığınız günün tahmini hava durumunu giriniz: ");
            hava = input.nextInt();

            if( hava < 5 ){
                System.out.println("Kayak");
            }else if ( (hava >= 5) && (hava < 15) ) {
                System.out.println("Sinema");
            }else if ( (hava >= 15) && (hava < 25) ) {
                System.out.println("Piknik");
            }else {
                System.out.println("Yüzme");
            }


    }
}
