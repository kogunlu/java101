package Java101;

import java.util.Scanner;
public class TriangleStars {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i=1, n;

        System.out.print("Basamak sayısını giriniz: ");
            n = input.nextInt();




                for (i=0; i<=n; i++) {

                    for ( int j =1; j <= (n-i); j++ ) {
                        System.out.print(" ");
                    }

                    for ( int k =1; k <= (2*i)+1; k++){
                        System.out.print("*");
                    }

                    System.out.println("");


                }



    }
}

