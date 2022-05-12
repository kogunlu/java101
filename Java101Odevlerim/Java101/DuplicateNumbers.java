package Java101;
import java.util.Arrays;
public class DuplicateNumbers {

static boolean isFind(int[] arr, int value) {
        for (int i : arr){
            if (i == value){
                return true;
            }

        }return false;
}
    public static void main(String[] args) {

        int[] list = {1, 2, 2, 2, 5, 4, 1, 6, 8, 8, 8, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] duplicate = new int[list.length];
        int startNumber = 0;

        for (int i = 0; i < list.length; i++){
            for (int k = 0; k < list.length; k++){

                if ( (i != k) && (list[i] == list [k]) && (list[i] % 2 == 0) ){
                    if (!isFind(duplicate, list[i])){
                        duplicate[startNumber++] = list[i];
                    }
                    break;
                }


            }
        }

        System.out.println(Arrays.toString(duplicate));

    }
}
