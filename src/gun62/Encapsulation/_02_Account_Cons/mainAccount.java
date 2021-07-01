package Encapsulation._02_Account_Cons;

public class mainAccount {
    public static void main(String[] args) {

        //Constructer sayesinde daha kolay veri girebiliyoruz.
        Account account1 = new Account(12, "Burak", "brk@brk.com", 12);

        //verileri alabilmek içinde getter oluşturuyoruz. Getir gibi
        System.out.println(account1.getAcc_number() + " " + account1.getName() + " " + account1.getEmail() + " " + account1.getAmount());
    }
}
