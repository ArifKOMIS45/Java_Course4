package gun43.JavaExection;

public class _04_JavaRunTimeexeption {
    public static void main(String[] args) {
        String str = "";
        int a = 5;
        int b = 0;
        int c = 0;

        //Catch bloklarin a hango hata once gelirse ona uygun hata yazilir,genel exception en sona yazilir
        try {
            System.out.println("1. adim");
            char ilkharf = str.charAt(0);
            System.out.println("2,adim");
            c = a / b;
            System.out.println("3.adim");
        } catch (StringIndexOutOfBoundsException ex) {
            System.out.println("4.adim");
            System.out.println("Hata:String dizisi siniri asildi");

        } catch (ArithmeticException ex) {

            System.out.println("Hata: Aritmetik islem hatasi");
        } catch (Exception ex) {//hangi hata olursa olsun hata oldugunda exception catch calisir
            System.out.println("Hata:Genel hata olustu");
        }
        System.out.println("Program sonu");
    }


}
