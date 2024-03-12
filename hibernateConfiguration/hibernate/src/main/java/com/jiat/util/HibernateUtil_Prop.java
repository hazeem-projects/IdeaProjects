package com.jiat.util;

import com.jiat.entity.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Properties;


public class HibernateUtil_Prop {
    private static final SessionFactory SESSION_FACTORY = buildSessionFactory();

    private static SessionFactory buildSessionFactory(){
        try {

//            return new Configuration()
//                    .addAnnotatedClass(User.class)
//                    .buildSessionFactory();


            //Custom Properties file

            Properties properties = new Properties();
            properties.load(HibernateUtil_Prop.class.getClassLoader().getResourceAsStream("hibernate-dev.properties"));


            return new Configuration()
                    .addProperties(properties)
                    .addAnnotatedClass(User.class)
                    .buildSessionFactory();

        }catch (Throwable ex){
            ex.printStackTrace();
            throw new ExceptionInInitializerError();
        }
    }

    public static SessionFactory getSessionFactory(){
        return SESSION_FACTORY;
    }

    public static void close(){
        getSessionFactory().close();
    }
}
