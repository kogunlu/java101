package Java101;

import java.util.Scanner;
public class Password {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int password;
        boolean isPasswordSuccess = false;

        while (!isPasswordSuccess){
            System.out.print("Şifrenizi giriniz: ");
            password = inp.nextInt();

            if (password==123){
                isPasswordSuccess = true;
                System.out.println("Şifre doğru.");
            }else {
                System.out.println("Geçersiz şifre girdiniz, tekrar deneyin.");

            }
        }


    }
}
