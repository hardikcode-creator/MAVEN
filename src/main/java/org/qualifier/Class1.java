package org.qualifier;

public class Class1 {

    private String street;
    private String city;
    private String getStreet(){
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Class1(String street, String city) {
        this.street = street;
        this.city = city;
    }
    public Class1(){}

    @Override
    public String toString() {
        return "Class1{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
