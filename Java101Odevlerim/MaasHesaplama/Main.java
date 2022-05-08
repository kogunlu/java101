package MaasHesaplama;
public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("Kuday", 10000,40,2020);
        Employee e2 = new Employee("Kemal", 2000,45,1985);
        e1.toMyString();
        e2.toMyString();
    }
}
