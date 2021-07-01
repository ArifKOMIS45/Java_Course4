package calismalar;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class calisma2 {
    public static void main(String[] args) throws IOException {
        File file = new File("c:/Users/chem/Desktop/symbol.txt");//dosyayi bul
        Scanner scan = new Scanner(file);//dosyayi okut

        String cont = "";//baska bir dosyaya aktarmak icin lazim olan bos string

        while (scan.hasNextLine()) {//okumanin son satirina kada demek
            cont = cont.concat(scan.nextLine() + "\n");//yeni dosyaya eklemek \n koyayarak satir basi yapiliyor
        }
        FileWriter writer = new FileWriter("c:/Users/chem/Desktop/Arif.txt");//yeni dosya olusturduk
        writer.write(cont);//bunu yazdirdik
        writer.close();//yazmayii kapattik

    }
}
