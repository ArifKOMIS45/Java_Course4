package Encapsulation._00_Car;

public class mainCar {
    public static void main(String[] args) {

        //Public ile yaz. Sonra private'a çevir.
        //Ben bu arabanın özelliklerini başkalarının değiştirmesini istemiyorum.
        Car car = new Car();

        car.setRenk("Gümüş");
        car.setModel("Renault Megane");
        car.setMotor(1.6);
        car.setKapi(4);

//        car.renk = "Gümüş"; //todo (1) --------
//        car.model = "Renault Megane";
//        car.motor = 1.6;
//        car.kapi = 4;

        System.out.println("Arabanın Rengi: " + car.getRenk());
        System.out.println("Arabanın Modeli: " + car.getModel());
        System.out.println("Arabanın Motoru: " + car.getMotor());
        System.out.println("Arabanın kapı sayısı: " + car.getKapi());

    }
}
