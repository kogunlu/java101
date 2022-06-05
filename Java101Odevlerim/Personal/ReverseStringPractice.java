package Personal;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseStringPractice {
    public static void main(String[] args) {

Scanner input = new Scanner(System.in);
        System.out.print("Cümleyi yazınız: ");
            String sentence = input.nextLine();

        char[] charSentence = sentence.toCharArray();

    //    System.out.println(Arrays.toString(charSentence));   ---> test etmek için yazıldı.


        char[] reverseSentenceChar = new char[charSentence.length];
        int k = 0;

        for(int i = charSentence.length-1; i >= 0; i--){

                reverseSentenceChar[k] = charSentence[i];
               // System.out.println(Arrays.toString(reverseSentenceChar)); ==>>> test için oluşturuldu.

                k++;
        }


        String reverseSentence = String.valueOf(reverseSentenceChar);
        System.out.println(reverseSentence);

    }
}
