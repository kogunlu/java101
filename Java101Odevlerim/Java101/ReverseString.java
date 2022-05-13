package Java101;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Bir metin giriniz: ");
        String text = input.nextLine();

        char[] arr = text.toCharArray();

        for (int i = arr.length -1; i >= 0; i --){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
