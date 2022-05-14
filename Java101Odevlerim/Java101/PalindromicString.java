package Java101;

import java.util.Scanner;
public class PalindromicString {
    public static void main(String[] args) {

        System.out.println(isPalindrome("kayak"));

    }

    static boolean isPalindrome(String str){

        String reverse = "";

            for(int k = str.length()-1; k >= 0; k--){
                reverse += str.charAt(k);
            }

            if(str.equalsIgnoreCase(reverse)){
                return true;
            }else{
                return false;
            }
    }
}
