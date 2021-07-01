package Polymorphism._01_P;

public class marketMain {
    public static void main(String[] args) {

        alisveris market = new alisveris();
        cocuk evlat = new cocuk();
        ebeveyn baba = new ebeveyn();


        marketeGit(market);
        marketeGit(evlat);
        marketeGit(baba);


    }

    public static void marketeGit(alisveris market) {
        market.marketeGit();
    }
}
