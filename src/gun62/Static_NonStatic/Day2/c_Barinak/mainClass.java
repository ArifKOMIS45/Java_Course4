package Static_NonStatic.Day2.c_Barinak;

public class mainClass {

    /*
    Barınaktan hayvan sahiplenme
    todo AMAÇ: ----------------------------
    Barınakta sadece kedi ve köpek vardır.
    ilk olarak;
    Sistem bize "Barınakta bulunan hayvanlar:
    Kedi
    köpek
    Hangi hayvanı sahiplenmek istiyorsunuz?:
    şeklinde bir çıktı versin.

    Kullanıcı kedi veya köpek girdiğinde, seçtiği hayvanın bilgileri gelmeli ve sistem son bulmalı.
    Eğer başka bir hayvan girerse "barınakta böyle bir hayvan bulunmamaktadır" uyarısını versin ve tekrar en başa dönsün, yani hangi hayvanı sahiplenmek istersiniz? sorusuna dönsün.
    Ta ki kedi veya köpek girene kadar...
        todo ----------------------------------------
    hayvanlar isminde yan bir class oluşturun. İçerisinde;

     String hayvan;
     int yasi;
     String renk;
     olsun.

     bu classın içine tercihler isminde void bir method oluşturun.

     todo---Kedi
     kullanıcı büyük-küçük harf gözetmeksizin   "kedi" yazarsa;
     yaş=4'e , renk ise beyaza eşit olsun.
     ve alt alta:
     hangi hayvan: kedi
     yaş : 4
     renk : beyaz            çıktısı gelsin.

    todo--Köpek
    kullanıcı büyük-küçük harf gözetmeksizin   "köpek" yazarsa;
    yaş=3'e , renk ise siyaha eşit olsun.
    ve alt alta:
    hangi hayvan: köpek
    yaş : 3
    renk : siyah            çıktısı gelsin.
A
    todo Başka bir değer girilirse(örn: hamster)
    Sistem bize
    Barınağımızda böyle bir hayvan bulunmamaktadır..
    mesajını verdikten sonra tekrar en başa yani:
    Hangi hayvanı sahiplenmek istiyorsunuz? sorusuna gelip devam etsin.
 */
    public static void main(String[] args) {

        hayvanlar hayvan = new hayvanlar();

        System.out.println("Barınakta bulunan hayvanlar : ");
        System.out.println("Kedi");
        System.out.println("Köpek");


        hayvan.tercihler();

    }

}
