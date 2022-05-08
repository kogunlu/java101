package BoksOyunu;

public class Ring {
    Fighter f1;
    Fighter f2;
    int maxWeight;
    int minWeight;

    Ring (Fighter f1, Fighter f2, int maxWeight, int minWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }

    public void run(){
        if(isWeightsOk()){
            while (f1.health > 0 && f2.health > 0) {
                System.out.println("=====Yeni Round=====");
                f2.health = f1.hit(f2);

                if (isWin()) {
                    break;
                }


                f1.health = f2.hit(f1);

                if (isWin()) {
                    break;
                }
                printScore();
            }


        }else{
            System.out.println("Sporcuların ağırlıkları uyuşmuyor, karşılaşma yapılamaz.");
        }



    }

    public boolean isWeightsOk(){
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }
    public boolean isWin(){
        if (f1.health == 0){
            System.out.println("Maçı kazanan: " + f2.name);
            return true;
        }
        if (f2.health == 0){
            System.out.println("Maçı kazanan: " + f1.name);
            return true;
        }
        return false;
    }

    public void printScore(){
        System.out.println("-------");
        System.out.println(f1.name + " kalan can:  " + f1.health);
        System.out.println(f2.name + " kalan can: " + f2.health);
    }
}
