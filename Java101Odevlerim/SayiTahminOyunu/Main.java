package SayiTahminOyunu;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


      int number = (int) (Math.random() * 100) ;
        System.out.println(number);

        int right = 0;
        boolean isMistakenSelectedNumber = false;
        boolean isWin = false;
        int[] wrongSelectedNumbers = new int[5];


        while (right < 5){
            System.out.print("Tahmininizi giriniz: ");
                Scanner input = new Scanner(System.in);
                    int selectedNumber = input.nextInt();

                        if (selectedNumber < 0 || selectedNumber > 99){
                            System.out.println("Girilen sayı 0-99 arasında olmalıdır, lütfen tekrar deneyin.");

                                if (isMistakenSelectedNumber){
                                    right ++;
                                        System.out.println("Çok fazla hatalı giriş yaptınız, kalan hakkınız: " + (5-right));
                                            }else{
                                    isMistakenSelectedNumber = true;
                                System.out.println("Tekrar hatalı giriş yapmanız halinde, deneme hakkınız azaltılacaktır!\"");
                                }
                                continue;
                        }

                        if(selectedNumber == number){
                            isWin = true;
                                break;

                            }else{
                                System.out.println("Yanlış tahminde bulundunuz, lütfen tekrar deneyin.");
                                    System.out.println("Kalan deneme hakkınız: " + (4-right));
                                        wrongSelectedNumbers[right] = selectedNumber;
                                            right ++;

                                        if(selectedNumber < number) {
                                            System.out.println("İpucu: Seçmiş olduğunuz " + selectedNumber + " sayısı, " +
                                                "hedef sayıdan küçüktür.");
                                        }else{
                                            System.out.println("İpucu: Seçmiş olduğunuz " + selectedNumber + " sayısı, " +
                                                "hedef sayıdan büyüktür.");
                                    }
                        }
        }

        if (isWin){
            System.out.println("Tebrikler, doğru tahmin ettiniz. Tahmin ettiğiniz sayı: " +number);
        }else{
            System.out.println("Kaybettiniz.");
                if(!isMistakenSelectedNumber){
                    System.out.println("Tahminde bulunduğunuz sayılar: " + Arrays.toString(wrongSelectedNumbers));
                }
        }


    }
}
