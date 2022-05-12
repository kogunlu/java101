package Java101;
import java.util.Arrays;
import java.util.Scanner;
public class OrderArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dizi elaman sayısını girin: ");
            int a = input.nextInt();

        int[] list = new int[a];

        for (int i = 0; i < list.length; i++){
            System.out.print(i+1 + ". elemanı girin: ");
                int k = input.nextInt();
                list[i] = k;
            System.out.println(list[i]);
        }
        System.out.println("Girilen dizi aşağıdadır.");
        System.out.println(Arrays.toString(list));

        Arrays.sort(list);


        System.out.println("Sayıların küçükten büyüğe sıralanmış hali aşağıdadır.");
        System.out.println(Arrays.toString(list));


    }
}
