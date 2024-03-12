package com.jiat.main;


import com.jiat.entity.User;
import com.jiat.util.HibernateUtil;
import com.jiat.util.HibernateUtil_Prop;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.*;
import org.hibernate.query.Query;
import org.hibernate.service.NullServiceException;

import java.io.Serializable;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();

        //Criteria criteria=session.createCriteria(User.class);
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("UPDATE User set email=:email where id=:id");
        query.setParameter("id","5L");
        query.setParameter("email","abc@gmail.com");

        Object o1 = query.uniqueResult();

        transaction.begin();
        transaction.commit();


        //  ProjectionList pl= Projections.projectionList().add(Projections.property("id")).add(Projections.property("email"));
    //  criteria.setProjection(pl);

    //List<User> li=query.list();

      //li.forEach(o -> {

        //  System.out.println(o.getEmail());



    //});
}
}