package Odevler.interface1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        Car car = new Car();
        Scanner dp = new Scanner(System.in);

        System.out.print("hiz arttir= ");
        int speedIncrease = dp.nextInt();
        bicycle.speedUp(speedIncrease);
        car.speedUp(speedIncrease);
        System.out.print(" hiz azalt");
        int speedDecrease = dp.nextInt();
        bicycle.applyBrakes(speedDecrease);
        car.applyBrakes(speedDecrease);
        System.out.println("bisiklet vites= ");
        int gearForBicycle = dp.nextInt();
        bicycle.changeGear(gearForBicycle);
        System.out.println("Araba vites= ");
        int gearForCar = dp.nextInt();
        car.changeGear(gearForCar);

        System.out.println(bicycle.printAll());
        System.out.println(car.printAll());


    }
}
