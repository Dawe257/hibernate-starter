package com.dzhenetl;

import com.dzhenetl.entity.Employee;
import com.dzhenetl.util.SessionManager;
import org.hibernate.Session;


public class TestUpdateEmployee {
    public static void main(String[] args) {
        try (Session session = SessionManager.getSession()) {
            session.beginTransaction();
            Employee employee = session.get(Employee.class, 3);
            employee.setSalary(999);
            session.getTransaction().commit();

            session.beginTransaction();
            session.createQuery(
                    "update Employee set salary = 1000 where name = 'Ivan'")
                    .executeUpdate();
            session.getTransaction().commit();
        }
    }
}
