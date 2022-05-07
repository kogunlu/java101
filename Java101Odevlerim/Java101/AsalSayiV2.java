package Java101;

import java.util.Scanner;
class AsalSayiV2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
            int a = input.nextInt();

            if(asal(a) == true){
                System.out.println("Sayı asaldır");
            }else{
                System.out.println("Asal değildir.");
            }
    }
    static boolean asal(int n){

        boolean result = true;

        if(n==2){
            result = true;
        }
        for (int i = 2; i < n; i++ ){
            if (n % i == 0){
                result = false;
                break;
            }
        }

        return result;
    }


}
