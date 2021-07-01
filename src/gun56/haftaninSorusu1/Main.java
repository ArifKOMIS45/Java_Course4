package gun56.haftaninSorusu1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Registration userReg = new Registration();
        ArrayList<User> register = userReg.register();
        userReg.printHappyUsers(register);

    }
}
