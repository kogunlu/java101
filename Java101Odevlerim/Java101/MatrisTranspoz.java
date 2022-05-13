package Java101;

import java.lang.reflect.Array;

public class MatrisTranspoz {
    public static void main(String[] args) {

        int[][] list = {
                {2,3,4},
                {5,6,7}
        };

        int row = 2;
        int column = 3;

        int [][] transpoze = new int [column][row];

        for (int i = 0; i < list.length; i++){
            for (int j = 0; j < list[i].length; j++ ){
                transpoze[j][i] = list[i][j];
            }
        }

        for (int a = 0; a< transpoze.length; a++) {
            for (int b = 0; b < transpoze[a].length ; b++) {
                System.out.print(transpoze[a][b] + " ");
            }
            System.out.println();
        }


    }
}
