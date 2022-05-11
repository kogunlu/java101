package Java101;

public class StarLetterB {
    public static void main(String[] args) {

    String [][] letterB = new String[9][9];

    for (int i = 0 ; i < letterB.length; i ++){
        for (int k = 0; k < letterB[i].length; k++){

            if( (i == 0 || i == 4 || i == 8 ) && (k < 7) ){
                letterB [i][k] = "*";
            }else if ( k ==0 || ( (k == 8) && (i > 0 && i <8) ) ) {
                letterB [i][k] = "*";
            }else {
                letterB [i][k] = " ";
            }
        }
    }

        for (String[] row : letterB){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}


/*

********
*       *
*       *
*       *
*******
*       *
*       *
*       *
********

9 x 9 dizi
1-5-9 satırlar 8 tane yıldız
geri kalanların 1. ve 9. sütunlarına yıldız

 */