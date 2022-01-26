package com.dzhenetl.one_to_one;

import com.dzhenetl.entity.Detail;
import com.dzhenetl.entity.Employee;
import com.dzhenetl.util.SessionManager;
import org.hibernate.Session;
import org.springframework.stereotype.Component;

@Component
public class TestUniDirectional {
    public static void main(String[] args) {
        try (Session session = SessionManager.getSession()) {
//            Employee employee = new Employee("Oleg", "Smirnov", "Sales", 600);
//            Detail detail = new Detail("Moscow", "321321", "oleg@mail.mail");
//            employee.setDetail(detail);
//
//            session.beginTransaction();
//            session.save(employee);
//            session.getTransaction().commit();
        }
    }
}
