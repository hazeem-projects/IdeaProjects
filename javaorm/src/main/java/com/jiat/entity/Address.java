package com.jiat.entity;

import javax.persistence.*;
import java.util.*;

@Entity
public class Address {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }



    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    private String no;
    private String Street;
    private String city;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    private String postalCode;

    @ManyToMany(mappedBy = "Address1")
    private List<Student> students=new ArrayList<>();



}
