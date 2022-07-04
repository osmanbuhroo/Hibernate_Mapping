import javax.persistence.Embeddable;

@Embeddable
public class Address {
    private int PinCode;
    private  String State ;
    private  String Country;

    public Address() {
    }

    public Address(int pinCode, String state, String country) {
        PinCode = pinCode;
        State = state;
        Country = country;
    }

    public int getPinCode() {
        return PinCode;
    }

    public void setPinCode(int pinCode) {
        PinCode = pinCode;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "PinCode=" + PinCode +
                ", State='" + State + '\'' +
                ", Country='" + Country + '\'' +
                '}';
    }
}
