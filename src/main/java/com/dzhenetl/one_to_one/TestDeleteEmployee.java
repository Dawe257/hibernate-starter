package com.dzhenetl.one_to_one;

import com.dzhenetl.entity.Employee;
import com.dzhenetl.util.SessionManager;
import org.hibernate.Session;

public class TestDeleteEmployee {
    public static void main(String[] args) {
        try (Session session = SessionManager.getSession()) {
            Employee employee = session.get(Employee.class, 2);
            session.beginTransaction();
            session.delete(employee);
            session.getTransaction().commit();


            session.beginTransaction();
            session.createQuery("delete Employee where id = 5").executeUpdate();
            session.getTransaction().commit();
        }
    }
}
