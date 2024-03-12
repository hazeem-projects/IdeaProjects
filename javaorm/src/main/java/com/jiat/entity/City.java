package com.jiat.entity;

import javax.persistence.*;
import java.util.List;
import java.util.ArrayList;

@Entity
public class City {
    public City(int id) {
        this.id = id;
    }
    public City() {

    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
@OneToMany(mappedBy = "city")
    private List<Student> Students=new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public City(String name,int id ) {
this.id=id;
        this.name = name;
    }

    public List<Student> getStudents() {
        return Students;
    }

    public void setStudents(List<Student> students) {
        Students = students;
    }

    public void setName(String name) {
        this.name = name;
    }

}
