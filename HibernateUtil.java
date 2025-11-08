package com.example;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

// Utility class to create and provide a SessionFactory (like DB connection pool)
public class HibernateUtil {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            // Create session factory from configuration file
            return new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        } catch (Exception ex) {
            System.err.println("Initial SessionFactory creation failed: " + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
