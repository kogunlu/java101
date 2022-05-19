package Personal;
import java.util.Scanner;
class Practice {
    public static void main(String[] args) {

        int i,n;
Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        n = input.nextInt();

        for (i=1; i<=n; i++){

            if ( (i % 3 == 0) && ( !(i % 4 == 0)) ){
                System.out.print("Kuday" +",");

            }else if ( (i % 4 == 0) && (! (i % 3 == 0)) ) {
                if ( i == n){
                    System.out.print("Ogunlu");

                }else System.out.print("Ogunlu" + ",");


            }else if ( (i % 3 == 0) && (i % 4 == 0)){
                System.out.print("KudayOgunlu" + ",");

            }else{
                System.out.print(i + ",");

            }
        }


    }
}