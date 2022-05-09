package Java101;
import java.util.Arrays;
import java.util.Scanner;

public class NearNumber {
    public static void main(String[] args) {

        int[] list = {-12, -120, 50, 25, 9, 11};
        Arrays.sort(list);
        System.out.println("Küçükten büyüğe sıralama");
        System.out.println(Arrays.toString(list));

        Scanner input = new Scanner(System.in);
            System.out.print("Bir sayı giriniz: ");
            int sayi = input.nextInt();

        for (int i = 0; i < list.length; i++){

       //   System.out.println(list[i]); > Dönen sayıları görmek için yazıldı.

            if (sayi < list[i]){
                System.out.println("Girilen sayıdan büyük ilk sayı: " + list[i]);
                System.out.println("Girilen sayıdan küçük ilk sayı: " + list[i-1]);
                break;
            }


        }
    }
}
