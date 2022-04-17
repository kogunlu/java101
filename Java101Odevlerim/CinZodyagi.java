import java.util.Scanner;
public class CinZodyagi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        String burc = "";

        System.out.print("Doğum yılınızı giriniz: ");
        age = input.nextInt();

        if (age % 12 == 0) {
            burc = "Maymun";
        } else if (age % 12 == 1) {
            burc = "Horoz";
        } else if (age % 12 == 2) {
            burc = "Köpek";
        } else if (age % 12 == 3) {
            burc = "Domuz";
        } else if (age % 12 == 4) {
            burc = "Fare";
        } else if (age % 12 == 5) {
            burc = "Öküz";
        } else if (age % 12 == 6) {
            burc = "Kaplan";
        } else if (age % 12 == 7) {
            burc = "Tavşan";
        } else if (age % 12 == 8) {
            burc = "Ejderha";
        } else if (age % 12 == 9) {
            burc = "Yılan";
        } else if (age % 12 == 10) {
            burc = "At";
        } else if (age % 12 == 11) {
            burc = "Koyun";
        }
            System.out.println("Çin Zodyağı burcunuz: " + burc);
        }
    }
