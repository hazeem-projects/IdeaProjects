package com.jiat;

import com.jiat.entity.Address;
import com.jiat.entity.City;
import com.jiat.entity.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class Test {

    public static void main(String[] args) {



        Address address=new Address();
        address.setNo("75");
        address.setCity("Kandy");
        address.setStreet("Abdul hameed street");
        address.setPostalCode("40000");

        Address address1=new Address();
        address1.setNo("80");
        address1.setCity("Colombo");
        address.setStreet("Abdul hameed street");
        address.setPostalCode("52000");

        Student student = new Student("Ahmed", "Raza", "200210304063", "kandy-01");
        Student student1 = new Student("Muhammed", "Hazeem", "199835410549", "Colombo-12");

 student.getAddress1().add(address);
 student.getAddress1().add(address1);

 student1.getAddress1().add(address);
 student1.getAddress1().add(address1);

        address.getStudents().add(student);
        address.getStudents().add(student1);


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("abc");
 
    EntityManager em = entityManagerFactory.createEntityManager();


        EntityTransaction tr = em.getTransaction();
        tr.begin();
        em.persist(address);
        em.persist(student);
        em.persist(address1);
        em.persist(student1);

        tr.commit();
        em.close();


    }
}
