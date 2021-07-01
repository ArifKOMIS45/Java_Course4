package Gun64;

public class Customer {
    ElectricAccount acct = new ElectricAccount();

    public static void main(String[] args) {
        ElectricAccount account = new ElectricAccount();
        account.addkWh(60);
        account.addkWh(-50);
        account.addkWh(-10);
        System.out.println("account. = " + account.getBill());

        ElectricAccount account2 = new ElectricAccount();
        account2.addkWh2(60);
        account2.addkWh2(-50);
        account2.addkWh2(-10);
        account2.setBill(-100);
        System.out.println("account2. = " + account2.getBill());
    }

    public void useElectricity(double kWh) {
        acct.addkWh(kWh);
    }
}


class ElectricAccount {
    private final double rate = 0.07;
    private double kWh;
    private double bill;

    public double getBill() {
        return bill;
    }

    // doğru cevap olabilmesi için PRIVATE olmalı
    public void setBill(double kWh) {
        bill = kWh * rate;
    }

    public void addkWh(double kwH) {
        if (kwH > 0) {
            this.kWh += kwH;
            this.bill = this.kWh * rate;
        }
    }

    public void addkWh2(double kwH) {
        if (kwH > 0) {
            this.kWh += kwH;
            setBill(this.kWh);
        }
    }
}