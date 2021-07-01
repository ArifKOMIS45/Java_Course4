package gun48.soru2;

public class AccountMain {
    public static void main(String[] args) {
        Account yeni1 = new Account();
        yeni1.deposit(19900);
        try {

        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }
        yeni1.withdraw(5009);
        System.out.println("yeni1 = " + yeni1);
    }
}
