package Java101;

public class ArraysAvarage {
    public static void main(String[] args) {

        int [] list = {5, 10, 15, 20, 25, 30};
            double sum = 0.0;

        for (int i = 0; i < list.length; i++){
            sum += list[i];
        }

            double avarage = sum / list.length;
        System.out.println("Ortalama: " + avarage);
    }
}
