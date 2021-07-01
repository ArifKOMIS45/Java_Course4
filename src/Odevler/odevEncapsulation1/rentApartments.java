package Odevler.odevEncapsulation1;

public class rentApartments {

    private static int rent;
    private String name;
    private int roomCount;
    private boolean balconyOrNo;

    public rentApartments() {
    }

    public rentApartments(String name, int roomCount, boolean balconyOrNo) throws Exception {
        setName(name);
        setRoomCount(roomCount);
        setBalconyOrNo(balconyOrNo);
        rentFee();
    }

    public int rentFee() {
        int rent = 0;
        if (getRoomCount() == 0) rent = 1400;
        if (getRoomCount() == 1) rent = 1700;
        if (getRoomCount() == 2) rent = 2200;
        if (getRoomCount() == 3) rent = 2700;
        if (getBalconyOrNo()) rent += 200;
        return rent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) throws Exception {
        if (roomCount < 4)
            this.roomCount = roomCount;
        else throw new Exception("oda sayisi 0,1,2,3 olabilir");
    }

    public boolean getBalconyOrNo() {
        return balconyOrNo;
    }

    public void setBalconyOrNo(boolean balconyOrNo) {
        this.balconyOrNo = balconyOrNo;
    }

    @Override
    public String toString() {
        return "Rezarvasyon{" +
                "name= " + name +
                ", roomCount=" + roomCount +
                ", balconyOrNo=" + balconyOrNo +
                ", Rent=" + rentFee() +
                '}';
    }
}
