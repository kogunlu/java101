package Java101;

import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

       int year, flag;

        System.out.println("Artık yıl olup olmadığını sorgulamak istediğiniz yılı girin: ");
            year = inp.nextInt();

            if (year % 100 == 0){
                if(year % 400 == 0) {
                    flag = 1;
                }else {
                    flag = 0;
                }
            }else{
                if (year % 4 == 0){
                    flag = 1;
                }else{
                    flag = 0;
                }
            }
            if(flag == 1){
                System.out.println(year + " yılı bir artık yıldır.");
            }else{
                System.out.println(year + " yılı artık yıl değildir.");
            }
        }

    public static class ATM {
        public static void main(String[] args) {

        }
    }
}