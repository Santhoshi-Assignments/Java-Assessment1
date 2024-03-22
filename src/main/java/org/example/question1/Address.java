package org.example.question1;
class Address {
    private int houseNo;
    private String street;
    private String city;
    private int pincode;

    public Address(int houseNo, String street, String city, int pincode) {
        this.houseNo = houseNo;
        this.street = street;
        this.city = city;
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return houseNo + "," + street + "," + city + "," + pincode;
    }
}
