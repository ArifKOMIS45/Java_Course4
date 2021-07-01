package Gun64;

public class S154 {
    int count;

    public static void displayMsg() {
        //System.out.println("Welcome Visit Count: "+ count++);
        // static metoddan çağrılan her şy static olmalı
    }

    public static void main(String[] args) {
        S154.displayMsg();
        displayMsg();
    }
}
