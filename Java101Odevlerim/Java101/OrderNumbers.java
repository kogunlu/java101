package Java101;

import java.util.Scanner;
public class OrderNumbers {
    public static void main(String[] args) {


        int a, b, c;
        Scanner inp = new Scanner(System.in);

        System.out.println("Girilen sayıları küçükten büyüğe sıralayan program");
        System.out.print("İlk sayıyı giriniz: ");
            a = inp.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
            b = inp.nextInt();
        System.out.print("Üçüncü sayıyı giriniz: ");
            c = inp.nextInt();

            if( (a < b) && (b < c) ){
                System.out.println(a + "<" + b + "<" + c);
            }else if( (a < b) && (a < c) && (c < b) ){
                System.out.println(a + "<" + c + "<" + b);
            }else if( (b < a) && (a < c) ){
                System.out.println(b + "<" + a + "<" + c);
            }else if( (b < c) && (c < a) ){
                System.out.println(b + "<" + c + "<" + a);
            }else if( (c < a) && (a < b) ){
                System.out.println(c + "<" + a + "<" + b);
            }else if( (c < b) && (b < a) ){
                System.out.println(c + "<" + b + "<" + a);
            }else if ( (c==a) || (c==b) || (a==b) ){
                System.out.println("Aynı olan değerler var, lütfen birbirinden farklı değerler girin");
            }
    }
}
