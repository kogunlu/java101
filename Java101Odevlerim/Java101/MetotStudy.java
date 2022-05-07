package Java101;

public class MetotStudy {
    static int sum (int x, int y)
    {
        int result = x + y;
        return result;
    }

    public static void main(String[] args) {

        int toplam;

        toplam = sum(4,5) + sum(11,22) - sum(1,9);
        System.out.println(toplam);



    }
}
