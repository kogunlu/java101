import java.util.Scanner;
public class Faktoriyel {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i, c, n, r, nFak = 1, rFak = 1, nEksiRFak = 1;

        System.out.println("C(n,r)\nKombinasyonu alınacak sayıları giriniz");
        System.out.print("n: ");
            n = input.nextInt();
        System.out.print("r: ");
            r = input.nextInt();

            for (i=1; i <= n; i++){
                nFak = nFak * i;
            }
            for (i=1; i <= r; i++){
                rFak = rFak * i;
            }

            for (i=1; i <= (n-r); i++){
                nEksiRFak = nEksiRFak * i;
            }

            c = nFak / (rFak * nEksiRFak);
        System.out.println("C(n,r) " + c);

    }
}
