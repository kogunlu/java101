import  java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {

        String userName, password, reset, newPassword, newPassword1;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı adını giriniz: ");
        userName = inp.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        password = inp.nextLine();

        if ((userName.equals("patika")) && (password.equals("java101"))) {
            System.out.println("Giriş başarılı\nProgram sonu.");

        } else {
            System.out.println("Bilgileriniz yanlış!\nŞifrenizi sıfırlamak ister misiniz?\ne-Evet\nh-Hayır");
            reset = inp.nextLine();

            if (reset.equals("h")) {
                System.out.println("Şifreniz sıfırlanmadı, program bitti.");

            } else if (reset.equals("e")) {
                System.out.println("Yeni şifrenizi giriniz\nNot: Yeni şifreniz eski şifreniz ile aynı olamaz.");
                newPassword = inp.nextLine();

                if (newPassword.equals("java101")) {
                    System.out.print("Yeni şifreniz eskisi ile aynı olamaz!\nTekrar deneyin: ");
                   newPassword = inp.nextLine();

                    System.out.println("Şifre oluşturuldu, yeni şifreniz : " + newPassword);
                    System.out.println("Program bitti!");

                } else {
                    System.out.println("Şifre oluşturuldu, yeni şifreniz: " + newPassword);
                }
            } else {
                System.out.println("Geçersiz giriş yaptınız\nProgram bitti.");



            }
        }
    }
}