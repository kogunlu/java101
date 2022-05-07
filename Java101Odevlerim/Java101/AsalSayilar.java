package Java101;

public class AsalSayilar {
    public static void main(String[] args) {


int i, k;

        for (i=1; i <= 100; i ++){

            int sayac=0;

            for (k=2; k < i; k++ ){

                if ( i % k == 0){

                    sayac = 1;

                }


            }

            if (sayac == 0)
            {
            System.out.print(i + " ");
            }


        }



    }
}
