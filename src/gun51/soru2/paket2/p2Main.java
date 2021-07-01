package gun51.soru2.paket2;


import gun51.soru2.paket1.p1Hayvan;

public class p2Main {
    public static void main(String[] args) {
        p1Hayvan h = new p1Hayvan();
        h.ad = "kopek";
        // h.yas=2; cunku erisilemiyor default ve protected
        //h.cinsi="tekir";

        p2kedi kedi = new p2kedi("kopuk", "scptish");
        System.out.println(kedi);//cinsi protected ildi ulasmak icin bu paketin icinde extend ettik
        //en korumali private sonra default,protected, en genisi public
    }
}
