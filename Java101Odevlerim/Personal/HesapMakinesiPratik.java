package Personal;
import java.util.Scanner;

public class HesapMakinesiPratik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String menu = "1-Toplama\n2-Çıkartma\n3-Çarpma\n4-Bölme\n5-Üs Alma\n6-Karekök Alma\n7-Faktoriyel Alma\n0-Hesap Makinesini Kapat";
        while (true) {

            System.out.println(menu);
            System.out.println("=========");
            System.out.print("Yukarıdaki işlemlerden yapmak istediğinizi seçiniz: ");
            int x = input.nextInt();

                if(x == 0){
                    System.out.println("Hesap makinesinden çıkış yapıldı.");
                    break;
                }

            System.out.print("Birinci sayıyı girin: ");
            int a = input.nextInt();
            System.out.print("İkinci sayıyı girin: ");
            int b = input.nextInt();

            switch (x) {
                case 1:
                    System.out.println(a + " + " + b + " = " + topla(a, b));
                    break;

                case 2:
                    System.out.println(a + " - " + b + " = " + cikart(a, b));
                    break;

                case 3:
                    System.out.println(a + " x " + b + " = " + carp(a,b));
            }

            System.out.println("----------------------");
        }
    }



    public static int topla(int a, int b){
        return a+b ;
    }

    public static int cikart(int a, int b){
        return a-b;
    }

    public static int carp(int a, int b){
        return a*b;
    }

    //İşlemler bu şekilde devam eder....
}
