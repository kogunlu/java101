import java.sql.PreparedStatement;
import java.util.Scanner;
public class HesapMakinesiV2 {
    static int topla(int a, int b) {

        int sum = a + b;
        System.out.println("Toplam: " + sum);
        return sum;
    }
    static int cikar(int a, int b){
        int result = a - b;
        System.out.println("Sonuç: " + result);
        return result;
    }
    static double bol(double a, double b){
        if (b == 0){
            return 0;
        }
        double result = a / b;
        System.out.println("Sonuç: " + result);
        return result;
    }
    static int usAl(int a, int b){
    int result = 1;
        for ( int i = 1; i <= b; i++){
            result = result * a;
        }
        System.out.println("Sonuç: " + result);
        return result;
    }
    static int faktoriyel(int a, int b){
        int resultA = 1;
        int resultB =1;

        for( int i = 1; i <= a; i++){
            resultA *= i;
        }
        for (int k = 1; k <= b; k++){
            resultB *= k;
        }
        System.out.println(a + " faktoriyel = " + resultA);
        System.out.println(b + " faktoriyel = " + resultB);
        return 0;
    }
    static int modAl(int a, int b){
        int result = a % b;
        System.out.println(result);
        return 0;
    }
    static int dikdortgen(int a, int b){
        int alan = a * b;
        int cevre = 2 * ( a + b);
        System.out.println("Alan= " + alan);
        System.out.println("Çevre=" + cevre);
        return 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;


        String menu = "Yapmak istediğiniz işlemi giriniz\n" +
                "1-Toplama\n" +
                "2-Çıkarma\n" +
                "3-Bölme\n" +
                "4-Üs Alma\n" +
                "5-Faktoriyel Hesaplama\n" +
                "6-Mod Alma\n" +
                "7-Dikdörtgen alan ve çevre hesaplama\n" +
                "0-Çıkış";


            while (true) {

                System.out.println(menu);

                System.out.print("İşlem seçiminiz: ");
                select = input.nextInt();

                if (select == 0) {
                    System.out.println("Program bitti.");
                    break;
                }

                System.out.print("Birinci sayıyı giriniz: ");
                int a = input.nextInt();
                System.out.print("İkinci sayıyı giriniz: ");
                int b = input.nextInt();

                switch (select) {
                    case 1:
                        topla(a, b);
                        break;

                    case 2:
                        cikar(a, b);
                        break;

                    case 3:
                        if ( bol(a,b) == 0){
                            System.out.println("Bölen 0 olamaz.");
                        }
                        bol(a, b);
                        break;

                    case 4:
                        usAl(a,b);
                        break;

                    case 5:
                        faktoriyel(a,b);
                        break;

                    case 6:
                        modAl(a,b);
                        break;

                    case 7:
                        dikdortgen(a,b);
                        break;

                    default:
                        System.out.println("Hatalı giriş yaptınız, lütfen tekrar deneyin.");

                        // Default düzenlenecek
                        //Çarpma eklenecek
                }
            }
    }
}
