import java.util.Scanner;
class UsAlmaV2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Taban (üssü alınacak olan) sayıyı giriniz: ");
            int taban = input.nextInt();
        System.out.print("Üssü giriniz: ");
            int us = input.nextInt();

        System.out.println();
    }

    static int us(int a, int b){

        if (b==0){
            return 1;
        }

        int result = 1;

        result = result * us(a, b-1) * a;

        return result;
    }
}
