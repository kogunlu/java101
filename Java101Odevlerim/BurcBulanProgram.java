import java.util.Scanner;
public class BurcBulanProgram {
    public static void main(String[] args) {

    Scanner inp = new Scanner(System.in);
    int month, day;

        System.out.println("Doğduğunuz ayı rakam olarak giriniz (1-12): ");
            month = inp.nextInt();
        System.out.println("Doğduğunuz günü rakam olarak giriniz (1-31): ");
            day = inp.nextInt();

        switch (month){
            case 1:
                if(day <= 21){
                    System.out.println("Oğlak burcu");
                }else if( (day > 21) && (day <=31)){
                    System.out.println("Kova burcu");
                }else{
                    System.out.println("Geçersiz gün girdiniz, programı tekrar başlatarak yeniden veri girişi yapın.");
                }
                break;

            case 2:
                if (day <= 19){
                    System.out.println("Kova burcu");
                }else if ( (day > 19) && (day <= 28) ){
                    System.out.println("Balık burcu");
                }else {
                    System.out.println("Geçersiz gün girdiniz, programı tekrar başlatarak yeniden veri girişi yapın.");
                }
                break;

            case 3:
                if (day <= 20){
                    System.out.println("Balık burcu");
                }else if( (day > 20) && (day <= 31)){
                    System.out.println("Koç burcu");
                }else{
                    System.out.println("Geçersiz gün girdiniz, programı tekrar başlatarak yeniden veri girişi yapın.");
                }
                break;

            case 4:
                if (day <= 20 ){
                    System.out.println("Koç burcu");
                }else if( (day > 20) && (day <= 30)){
                    System.out.println("Boğa burcu");
                }else{
                    System.out.println("Geçersiz gün girdiniz, programı tekrar başlatarak yeniden veri girişi yapın.");
                }
                break;

            case 5:
                if (day <= 21 ){
                    System.out.println("Boğa burcu");
                }else if( (day > 21) && (day <= 31)){
                    System.out.println("İkizler burcu");
                }else{
                    System.out.println("Geçersiz gün girdiniz, programı tekrar başlatarak yeniden veri girişi yapın.");
                }
                break;

            case 6:
                if (day <= 22 ){
                    System.out.println("İkizler burcu");
                }else if( (day > 22) && (day <= 30)){
                    System.out.println("Yengeç burcu");
                }else{
                    System.out.println("Geçersiz gün girdiniz, programı tekrar başlatarak yeniden veri girişi yapın.");
                }
                break;

            case 7:
                if (day <= 22 ){
                    System.out.println("Yengeç burcu");
                }else if( (day > 22) && (day <= 31)){
                    System.out.println("Aslan burcu");
                }else{
                    System.out.println("Geçersiz gün girdiniz, programı tekrar başlatarak yeniden veri girişi yapın.");
                }
                break;

            case 8:
                if (day <= 22 ){
                    System.out.println("Aslan burcu");
                }else if( (day > 22) && (day <= 31)){
                    System.out.println("Başak burcu");
                }else{
                    System.out.println("Geçersiz gün girdiniz, programı tekrar başlatarak yeniden veri girişi yapın.");
                }
                break;

            case 9:
                if (day <= 22 ){
                    System.out.println("Başak burcu");
                }else if( (day > 22) && (day <= 30)){
                    System.out.println("Terazi burcu");
                }else{
                    System.out.println("Geçersiz gün girdiniz, programı tekrar başlatarak yeniden veri girişi yapın.");
                }
                break;

            case 10:
                if (day <= 22 ){
                    System.out.println("Terazi burcu");
                }else if( (day > 22) && (day <= 31)){
                    System.out.println("Akrep burcu");
                }else{
                    System.out.println("Geçersiz gün girdiniz, programı tekrar başlatarak yeniden veri girişi yapın.");
                }
                break;

            case 11:
                if (day <= 21 ){
                    System.out.println("Akrep burcu");
                }else if( (day > 21) && (day <= 30)){
                    System.out.println("Yay burcu");
                }else{
                    System.out.println("Geçersiz gün girdiniz, programı tekrar başlatarak yeniden veri girişi yapın.");
                }
                break;

            case 12:
                if (day <= 21 ){
                    System.out.println("Yay burcu");
                }else if( (day > 21) && (day <= 31)){
                    System.out.println("Oğlak burcu");
                }else{
                    System.out.println("Geçersiz gün girdiniz, programı tekrar başlatarak yeniden veri girişi yapın.");
                }
                break;
        }
        System.out.println("Program bitti.");


    }
}
