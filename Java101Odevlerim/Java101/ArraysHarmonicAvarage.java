package Java101;

public class ArraysHarmonicAvarage {
    public static void main(String[] args) {

        int[] list = {1, 2, 3, 4, 5, 6, 7, 8 ,9 ,10};
          double harmonicSum = 0.0;

        for(int i = 0; i < list.length; i++){
            harmonicSum += 1.0 / list[i];
            System.out.println(harmonicSum);
        }
        System.out.println("===========");

        double harmonicAvarage = list.length / harmonicSum;
            System.out.println(harmonicAvarage);
    }
}
