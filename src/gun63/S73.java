package gun63;

public class S73 {
    int x;
    int y;

    public static void main(String[] args) {
        S73 m1 = new S73();
        m1.x = 100;
        m1.y = 200;

        S73 m2 = new S73();
        m2.doStuff(m1.x, m1.y);// burada metodun içinde atamalar doğru yapılmadığı için değer atanamaz.

        m1.display(); // 100 200 :
        m2.display();
    }

    public void doStuff(int x, int y) {
        x = x; // sadece x kullanıldığında PARAMETREYI temsil eder
        // class ın fieldları ile bir etkisi bulunmadı.
        y = this.y;

        // yukarıdkai iki işlemde de nesnenin x ve y sine değer atanmaz.
        // değer atanabilmesi için this.x=x ve this.y=y olmalı
    }

    public void display() {
        System.out.print(x + " " + y + " : ");
    }
}

