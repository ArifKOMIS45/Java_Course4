package Encapsulation._02_Account_Cons;

public class Account {

    private final long acc_number;
    private final String name;
    private final String email;
    private final float amount;

    public Account(long acc_number, String name, String email, float amount) {
        this.acc_number = acc_number;
        this.name = name;
        this.email = email;
        this.amount = amount;
    }

    public long getAcc_number() {
        return acc_number;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public float getAmount() {
        return amount;
    }
}
