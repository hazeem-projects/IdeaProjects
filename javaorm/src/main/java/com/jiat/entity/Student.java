package com.jiat.entity;

import javax.persistence.*;
import java.util.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iid" )
            private int id;
 private String firstName;
 @Column(length = 300)
    private   String lastName;
    private  String nic;
    @Column(length = 200,columnDefinition = "text")
    private  String address;
    @ManyToMany
    @JoinTable(name = "abc",joinColumns=@JoinColumn(name = "sid"),inverseJoinColumns = @JoinColumn(name = "aid")

    )
    private List<Address> Address1=new ArrayList<>();


    @ManyToOne
 private  City city;

    public City getCity() {
        return city;
    }

    public List<Address> getAddress1() {
        return Address1;
    }
    public void setAddress(List<Address> address) {
        Address1 = address;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Student() {
    }

    public Student(String firstName, String lastName, String nic, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nic = nic;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



}
