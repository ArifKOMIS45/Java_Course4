package gun56.haftaninSorusu1;

import java.util.ArrayList;

public class Registration extends User {
    ArrayList<User> arrayList = new ArrayList<>();

    public ArrayList<User> register() {
        arrayList.add(new User());
        return arrayList;
    }

    public void printHappyUsers(ArrayList<User> arrayList) {
        if (registerDate.getSecond() <= 10) System.out.println(name);
    }
}
