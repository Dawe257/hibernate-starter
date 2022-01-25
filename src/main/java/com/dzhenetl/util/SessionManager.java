package com.dzhenetl.util;

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

    private static void buildFactory() {
        factory = new Configuration()
                .configure()
                .buildSessionFactory();
    }

    public static Session getSession() {
        return factory.openSession();
    }
}
