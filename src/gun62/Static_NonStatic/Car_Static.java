package Static_NonStatic;

public class Car_Static {

    //todo            Static olan methodlar
    //  Access Methods with an Object


    public static void tamGaz() {
        System.out.println("Bu araba bütün arabalardan daha hızlı!!!!");
    }

    public static void maxSpeed(int speed) {
        System.out.println("Bu arabanın maksimum hızı: " + speed);
    }

    public static void main(String[] args) {

        tamGaz();
        maxSpeed(500);
    }

}
