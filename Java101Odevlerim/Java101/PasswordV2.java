package Java101;

import java.util.Scanner;
public class PasswordV2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int password;
        boolean askPassword = true;



        do{
            System.out.print("Lütfen şifrenizi giriniz: ");
                password = input.nextInt();

                if(password==123){
                    askPassword = false;
                    System.out.println("Şifre doğru.");
                }else{
                    System.out.println("Şifre yanlış.");
                }

        }while(askPassword);


    }
}
