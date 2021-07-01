package gun48.soru1;

public class User {

    private static int idSayac = 1;
    private int id;
    private String username;
    private String password;
    private boolean active;
    private boolean signedIn;

    public User() {
    }

    public User(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
        setActive(true);
        setSignedIn(true);
        setId();//hata olan yeri altina alindiginda hata durumlarinda id artmaz

    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = idSayac++;
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

    //chechked exeptionolmadiginda bu metodun kullanilacagi nihai yer
    //mutlaka try catch kontrolu yapilmali yoksa program kirilir
    //kullanici dostu olmus olur
    public void setPassword(String password) {
        if (password.length() < 6) throw new RuntimeException("Password 6 karakterden az olamaz yeniden giriniz");
        else
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", active=" + active +
                ", signedIn=" + signedIn +
                '}';
    }
}

