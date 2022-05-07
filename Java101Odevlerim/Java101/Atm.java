package Java101;

import java.util.Scanner;
 class Atm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int Try = 3;
        String Username, Password;
        int islemKodu, islemKodu2;
        int accountBalance = 1000;
        int tutar;


        while (Try > 0) {
            System.out.print("Kullanıcı adı giriniz: ");
            Username = input.nextLine();


            System.out.print("Şifrenizi girin: ");
            Password = input.nextLine();

            islemKodu = 0;

            if (Username.equals("ogunlu") && Password.equals("findik")) {

                System.out.println("Mevcut bakiyeniz: " + accountBalance + " TL");

                while (islemKodu != 4){

                System.out.println("Yapmak istediğiniz işlemi seçin\n1-Para Çekme\n2-Para Yatırma\n3-Ödeme\n4-Çıkış " +
                        "Yap: ");
                    islemKodu = input.nextInt();



                        if (islemKodu == 1){
                            System.out.print("Tutar giriniz: ");
                            tutar = input.nextInt();

                            accountBalance -= tutar;

                            if(accountBalance >= 0){

                                System.out.print("İşlem sonrası bakiyeniz: " + accountBalance+ " TL");
                                System.out.println("");


                            }
                            else {
                                System.out.println("Bakiye yetersiz.");
                                System.out.println("");
                            }
                        }

                        if (islemKodu == 2){
                            System.out.print("Tutar giriniz: ");
                                tutar = input.nextInt();

                            if (tutar < 0){
                                System.out.print("Tutar negatif olamaz, lütfen geçerli tutar giriniz.");
                                System.out.println("");
                                System.out.print("Tutar giriniz: ");
                                tutar = input.nextInt();
                            }else
                                accountBalance += tutar;
                            System.out.println("İşlem sonrası bakinyeiz: " + accountBalance + " TL");

                            }
                        if (islemKodu == 3) {
                            System.out.println("1-Şans Oyunları\n2-Okul Harç Ödeme\n3-MTV Ödeme");
                            islemKodu2 = input.nextInt();

                        }

                        if (islemKodu == 4){
                            System.out.println("Çıkış başarılı.");
                        }

                        }
                        Try = 0;

                    }else {
                Try--;
                System.out.print("Hatalı giriş yaptınız, kalan deneme sayınız: " + Try);
                System.out.println();
                    if (Try ==0){
                        System.out.println("Hesabınız bloke olmuştur.");
                    }
            }

            }

        }



    }

