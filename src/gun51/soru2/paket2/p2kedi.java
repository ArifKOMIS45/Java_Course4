package gun51.soru2.paket2;

import gun51.soru2.paket1.p1Hayvan;

public class p2kedi extends p1Hayvan {


    public p2kedi(String ad, String cinsi) {
        super.ad = ad;
        super.cinsi = cinsi;
    }

    @Override
    public String toString() {
        return "p2kedi{" +
                "ad='" + ad + '\'' +
                ", cinsi='" + cinsi + '\'' +
                '}';
    }
}
