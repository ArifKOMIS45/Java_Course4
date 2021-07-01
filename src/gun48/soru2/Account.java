package gun48.soru2;

public class Account {
    private static int account = 10000;
    private int accountNumber;
    private double balance;

    public Account() {
        setAccountNumber();
        getBalance();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    private void setAccountNumber() {
        this.accountNumber = account++;
    }

    public double getBalance() {
        return balance;
    }

    protected double deposit(double miktar) {
        return balance += miktar;
    }

    protected double withdraw(double miktar) {
        if (miktar > 5000) throw new RuntimeException("Gunluk limiti astiniz");
        return balance -= miktar;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
