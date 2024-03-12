package com.jiat;

import com.jiat.entity.Address;
import com.jiat.entity.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class Test1 {

    public static void main(String[] args) {






        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("abc");

        EntityManager em = entityManagerFactory.createEntityManager();
       Address address=em.find(Address.class,2);

        Student Student=em.find(Student.class,2);
        List<Address> address1 = Student.getAddress1();

        address1.forEach(address2 -> {
            System.out.println(address2.getCity());
        });



       // EntityTransaction tr = em.getTransaction();
        //tr.begin();
        //em.persist(address);
        //em.persist(student);

        //tr.commit();
        //em.close();

     // Student student=  em.find(Student.class,1);
        //List<Address> address =student.;


    }
}
