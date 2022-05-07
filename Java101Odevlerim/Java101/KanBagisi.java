package Java101;

import java.util.Scanner;
public class KanBagisi {
    public static void main(String[] args) {

        /*18 yaşından küçük olanlar kan bağışı yapamazlar, fakat, 18 yaşına eşit ve büyük olan bir kişi
        eğer kilosu 48'den büyükse kan verebilir, kilosu 48'den küçükse kan veremez gibi basit bir kuralı
        Java'da kodlayalım.
         */

    int age, weight;
        Scanner input = new Scanner(System.in);
            System.out.print("Yaşınızı girin: ");
                age = input.nextInt();
            System.out.print("Kilonuzu girin: ");
                weight = input.nextInt();

    if ( (age >= 18) && (weight >= 48)){
        System.out.println("Kan bağışı yapabilirsiniz! ");
    }else {
        System.out.println("Kan bağışı yapamazsınız :( ");
    }

    }
}
