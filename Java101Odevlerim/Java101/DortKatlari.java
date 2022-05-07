package Java101;

import java.util.Scanner;
public class DortKatlari {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i, sum=0;

       do {
           System.out.print("Bir sayı girin: ");
            i = input.nextInt();

                if (i % 4 == 0){
                    sum = sum + i;
                    System.out.println("Toplam: "+ sum);
                }

       }while ( i % 2 == 0 );

        System.out.println("Program bitti.");
    }
}
