package Odevler.odevEncapsulation2;

public class Subscribe {

    private String name;
    private boolean doYouWanaSubscribe;
    private String whichMember;

    public Subscribe() {
    }

    public Subscribe(String name, boolean doYouWanaSubscribe, String whichMember) {
        setName(name);
        setDoYouWanaSubscribe(doYouWanaSubscribe);
        setWhichMember(whichMember);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getWhichMember() {
        return whichMember;
    }

    public String setWhichMember(String whichMember) {
        if (whichMember.equalsIgnoreCase("gold"))
            System.out.println("Welcome to membership Victoria. Your membership is 40 dollar for month you can enjoy the videos , all homework and see you soon.");
        if (whichMember.equalsIgnoreCase("silver"))
            System.out.println("Welcome to membership Victoria. Your membership is 20 dollar for month you can enjoy the videos and all homework.");
        if (whichMember.equalsIgnoreCase("bronze"))
            System.out.println("Welcome to membership Victoria. Your membership is 10 dollar for month you can enjoy the videos.");
        if (whichMember.equalsIgnoreCase("istemiyorum"))
            System.out.println("See you when you want to be a member. Thanks");

        this.whichMember = whichMember;
        return whichMember;
    }

    @Override
    public String toString() {
        return "Subscribe{" +
                "name='" + name + '\'' +
                ", doYouWanaSubscribe=" + isDoYouWanaSubscribe() +
                ", whichMember='" + whichMember + '\'' +
                '}';
    }

    public boolean isDoYouWanaSubscribe() {
        return doYouWanaSubscribe;
    }

    public void setDoYouWanaSubscribe(boolean doYouWanaSubscribe) {
        this.doYouWanaSubscribe = doYouWanaSubscribe;
    }
}
