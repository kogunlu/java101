package Personal;

public class Cars {

    String type = "Sedan";
    String color;
    String model;
    int speed;


    Cars (String type, String color, String model, int speed ){
        this.type = type;
        this.color = color;
        this.model = model;
        this.speed = speed;
    }

   int increaseSpeed(int amount)
   {
        if (speed < 180) {
            speed += amount;
   }
        return speed;
   }

   int decreaseSpeed(int amount){
       if(speed >0){
           speed -= amount;
       }return speed;
   }

   void printInfo(){

       System.out.println("=======");
       System.out.println("Model\t:" + this.model);
       System.out.println("Araç tipi\t:" + this.type);
       System.out.println("Araç rengi\t:" + this.color);
       System.out.println("Araç hızı\t:" + this.speed);
   }
}


