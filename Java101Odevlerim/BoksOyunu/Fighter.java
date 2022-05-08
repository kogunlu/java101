package BoksOyunu;

public class Fighter {

    String name;
    int damage;
    int health;
    int weight;
    double dodgeChance;

    Fighter (String name, int damage, int health, int weight, double dodgeChance){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodgeChance = dodgeChance;
    }

    public int hit(Fighter enemy){
        System.out.println("-----------");
        System.out.println(this.name + "====>" + enemy.name + " " +  this.damage + " hasar vurdu.");


        if(enemy.dodgeChance()){
            System.out.println(enemy.name + " gelen hasarı savurdu, hasar alınmadı.");
            return enemy.health;
        }

        if (enemy.health - this.damage < 0){
            return 0;
        }
        return enemy.health - this.damage;

    }

    boolean dodgeChance(){
        double randomValue = Math.random() * 100; //0.00-99.99 arası random sayı üretir
        return randomValue <= this.dodgeChance;
    }
}
