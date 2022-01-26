package com.dzhenetl.one_to_one;

import com.dzhenetl.entity.Detail;
import com.dzhenetl.entity.Employee;
import com.dzhenetl.util.SessionManager;
import org.hibernate.Session;

public class TestBiDirectional {
    public static void main(String[] args) {
        try (Session session = SessionManager.getSession()) {
//            Employee employee = new Employee("Petr", "Smirnov", "HR", 850);
//            Detail detail = new Detail("Moscow", "234123", "petr@misha");
//            employee.setDetail(detail);
//            detail.setEmployee(employee);
//            session.beginTransaction();
//            session.save(employee);
//            session.getTransaction().commit();
        }

    }
}
