package Odevler.interface1;

public class Bicycle implements Vehcile {
    int speed, gear;

    @Override
    public void changeGear(int gear) {
        this.gear = gear;
    }

    @Override
    public void speedUp(int speed) {
        this.speed += speed;
    }

    @Override
    public void applyBrakes(int c) {
        this.speed -= c;
    }

    @Override
    public String printAll() {
        return "current speed is " + speed + "gear count is " + gear;
    }
}
