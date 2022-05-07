package Java101;

import java.util.Scanner;
public class UsAlma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, k, i, total=1;

        System.out.print("Üssü alınacak sayıyı giriniz: ");
            n = input.nextInt();
        System.out.print("Üs olacak sayıyı giriniz: ");
            k = input.nextInt();

        for (i=1; i <= k; i++){

            total = total * n;
        }
        System.out.print(n + "^" + k + "= " + total);
    }
}
