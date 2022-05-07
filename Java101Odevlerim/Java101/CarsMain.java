package Java101;

public class CarsMain {
    public static void main(String[] args) {

        Cars audi = new Cars("Sport", "Red", "A3", 75);
        audi.increaseSpeed(50);
        audi.printInfo();

        Cars ford = new Cars("Hatchback", "Grey", "Fiesta", 50);
        ford.decreaseSpeed(25);
        ford.increaseSpeed(75);
        ford.printInfo();


    }
}
