package Cloning;


public class Basic_Cloning {
    public static void main(String [] args) throws Exception{
        Address a = new Address("nagpur");
        System.out.println(a.location);

        Address a1 = (Address)a.clone();
        //System.out.println(a.location == a1.location);
        //System.out.println(a.location.equals(a1.location));
    }
}
class Address {
    String location;

    Address(String location) {
        this.location = location;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}