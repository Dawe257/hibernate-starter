package com.dzhenetl;

import com.dzhenetl.entity.Employee;
import com.dzhenetl.util.SessionManager;
import org.hibernate.Session;

public class TestUniDirectional {
    public static void main(String[] args) {
        try (Session session = SessionManager.getSession()) {
            Employee employee = new Employee("Petr", "Sidorov", 800);

        }
    }
}
