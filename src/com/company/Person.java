package com.company;

public class Person {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private int zip;
    private String phoneNum;

    void setPerson(String firstName, String lastName, String address, String city, String state, int zip, String phoneNum){
        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
        this.city=city;
        this.state=state;
        this.zip=zip;
        this.phoneNum=phoneNum;
    }

    @Override
    public String toString(){
        return "\nFirst Name: "+firstName+
                "\nLast Name: "+lastName+
                "\nAddress: "+address+
                "\nCity: "+city+
                "\nState: "+state+
                "\nZip: "+zip+
                "\nPhone Number: "+phoneNum;
    }
}
