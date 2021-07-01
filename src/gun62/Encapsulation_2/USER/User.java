package Encapsulation_2.USER;

public class User {

    private static int sayac = 1;
    private int id;
    private String username;
    private String password;
    private boolean active;
    private boolean signedIn;

    public User(String username, String password) {
        //this.id = sayac++;
        setId();
        setUsername(username);
        setPassword(password);
        this.active = true;
        this.signedIn = false;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = sayac++; //sayac'yi buraya ekle
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() < 6) {
            System.out.println("Password 6 karakterden küçük olamaz.");
        } else if (password.length() > 12) {
            System.out.println("Password 12 karakterden büyük olamaz.");
        }

        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isSignedIn() {
        return signedIn;
    }

    public void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }
}
