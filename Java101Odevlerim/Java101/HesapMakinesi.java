package Java101;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1, n2, select, result;

        System.out.print("İlk sayıyı giriniz: ");
            n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
            n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkartma\n3-Çarpma\n4-Bölme");
        System.out.println("Lütfen yapmak istediğiniz işlemi yazınız: ");

        select = input.nextInt();

        switch (select){
            case 1 :
                result = n1 + n2;
                System.out.println(n1 + "+" + n2 + "=" + result);
                break;

            case 2 :
                result = n1 - n2;
                System.out.println(n1 + "-" + n2 + "=" + result);
                break;

            case 3 :
                result = n1 * n2;
                System.out.println(n1 + "*" + n2 + "=" + result);
                break;

            case 4 :
                if(n2!=0){
                    result = n1 / n2;
                    System.out.println(n1 + "/" + n2 + "=" + result);
                 }

                 else {
                    System.out.println("Herhangi bir sayi sifira bolunemez. Yeniden deneyiniz.");
                 }

                 break;

            default:
                System.out.println("Geçersiz komut girdiğiniz, lütfen yukarıdaki talimatları okuyun.");
        }

        System.out.println("Program bitti!");

    }
}