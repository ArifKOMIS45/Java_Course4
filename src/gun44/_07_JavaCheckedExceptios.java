package gun44;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class _07_JavaCheckedExceptios {
    public static void main(String[] args) {
        // try-Catch Bloğunu şart koştuğu komutların oluşturma ihtimali olan
        // hatalara CHECKED Exception denir.

        // Dosya okuma/yazma işlemi
        // bu işlemlerde hata olasılığı yüksek olduğundan
        // hata kontrolü zorunlu tutuluyor.
        // bu yüzden try-catch e alınması bu kodun zorunlu tutuluyor.
        // bu gibi surumlara karşılk gelen hatalara Checked Exception denir.
        // Özellikle IO (inputOutput) işlemleri Checked Exception dır.


        try {
            FileInputStream file = new FileInputStream("liste.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
