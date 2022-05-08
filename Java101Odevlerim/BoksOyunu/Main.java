package BoksOyunu;

public class Main {
    public static void main(String[] args) {
        Fighter MuhammedAli = new Fighter("MuhammedAli",25, 120, 90, 50);
        Fighter MykeTyson = new Fighter("MykeTyson", 35, 140, 100,25);
        Ring r = new Ring(MuhammedAli, MykeTyson, 100,85);

        r.run();
    }
}
