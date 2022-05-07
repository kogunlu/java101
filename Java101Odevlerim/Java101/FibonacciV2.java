package Java101;

import java.util.Scanner;
public class FibonacciV2 {

    static int fibonacci(int x){

        if( (x== 1) || (x==2) ){
            return 1;
        }
        return fibonacci(x-1) + fibonacci(x-2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
            int x = input.nextInt();

        System.out.println(fibonacci(x));

    }


}
