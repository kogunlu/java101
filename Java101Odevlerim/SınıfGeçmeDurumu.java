import java.util.Scanner;
public class SınıfGeçmeDurumu {
    public static void main(String[] args) {

        /*Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

Geçme Notu : 55

Ödev
Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın. */


        int mat, fiz, tur, kim, muz, sum, flag, avarage;
        Scanner input = new Scanner(System.in);
            flag = 0;
            sum = 0;

        System.out.println("Bahar dönemi derslerinizin sınav puanlarını giriniz");
            System.out.print("Matematik: ");
                mat = input.nextInt();
                    if( (mat >= 0) && (mat <= 100)){
                        flag = flag + 1;
                        sum += mat;
                    }

            System.out.print("Fizik: ");
                fiz = input.nextInt();
                    if( (fiz >= 0) && (fiz <= 100)){
                    flag += +1;
                    sum += fiz;
                    }

            System.out.print("Türkçe: ");
                tur = input.nextInt();
                        if( (tur >= 0) && (tur <= 100)){
                            flag += +1;
                            sum += tur;
                        }

            System.out.print("Kimya: ");
                kim = input.nextInt();
                            if( (kim >= 0) && (kim <= 100)){
                                flag += +1;
                                sum += kim;
                        }

            System.out.print("Müzik: ");
                muz = input.nextInt();
                                if( (muz >= 0) && (muz <= 100)){
                                    flag += +1;
                                    sum += muz;
                                }
                avarage = sum / flag;
                    if(avarage >= 55){
                        System.out.println("Tebrikler, bahar dönemini başarıyla tamamladınız!");
                        System.out.print("Ortalamanız: " + avarage);

                    }else{
                        System.out.println("Üzgünüz, bu dönemi başarılı bir şekilde tamamlayamadınız.");
                        System.out.print("Ortalamanız: " + avarage);
                    }


}
}
