package com.dzhenetl.util;

import com.dzhenetl.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class SessionManager {
    private static SessionFactory factory;

    static {

        loadDriver();
        buildFactory();

    }

    private static void loadDriver() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void buildFactory() {
        factory = new Configuration()
                .configure()
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
    }

    public static Session getSession() {
        return factory.openSession();
    }
}
