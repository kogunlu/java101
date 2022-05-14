package MayinTarlasiOyunu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the size of the board : ");


        System.out.print("Row Number : ");

        int rowNumber = input.nextInt();

        System.out.print("Column Number : ");

        int columnNumber = input.nextInt();


        MineSweeper ms = new MineSweeper(rowNumber,columnNumber);

        ms.runGame();

    }
}