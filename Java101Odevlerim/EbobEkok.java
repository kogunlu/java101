import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
            int n1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
            int n2 = input.nextInt();

        System.out.println("EBOB");
        System.out.println("-------");

        int i = 1;
        int ebob = 1, ekok=1 ;

            if (n1  < n2){

                while (i <= n1){
                    if ( (n1 % i == 0) && (n2 % i == 0))
                        ebob = i;

                    i++;
                }
                System.out.println("Girilen sayıların EBOB'u: " + ebob);



            }
            else {
                while (i <= n2) {
                    if ((n1 % i == 0) && (n2 % i == 0)) {
                        ebob = i;
                    }

                    i++;
                }
                System.out.println("Girilen sayıların EBOB'u: " + ebob);
            }

        System.out.println("");
        System.out.println("");
        System.out.println("================================");
        System.out.println("");
        System.out.println("");
        System.out.println("EKOK");
        System.out.println("-------");

            if (n1 < n2){

            int tempN1 = n1;

                for (i=1; i <= n2; i++){

                    tempN1 = n1 * i;

                    if ( (tempN1 % n1 ==0) && (tempN1 % n2 ==0)){
                        ekok = tempN1;
                        System.out.println("Girilen sayıların EKOK'u: " + tempN1);
                        break;
                    }

                }



            }else{
                int tempN2 = n2;

                for (i=1; i <= n1; i++){

                    tempN2 = n2 * i;

                    if ( (tempN2 % n1 ==0) && (tempN2 % n2 ==0)){
                        ekok = tempN2;
                        System.out.println("Girilen sayıların EKOK'u: " + tempN2);
                        break;
                    }

                }



            }










    }
}
