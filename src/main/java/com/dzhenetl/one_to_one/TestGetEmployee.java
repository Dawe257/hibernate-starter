package com.dzhenetl.one_to_one;

import com.dzhenetl.entity.Employee;
import com.dzhenetl.util.SessionManager;
import org.hibernate.Session;

import java.util.Comparator;
import java.util.List;

public class TestGetEmployee {
    public static void main(String[] args) {
        try (Session session = SessionManager.getSession()) {
            Employee employee = session.get(Employee.class, 1);

            List<Employee> employees = session.createQuery(
                            "from Employee where salary > 100000",
                            Employee.class).getResultList();
            employees.stream().sorted(Comparator.comparingInt(Employee::getId))
                    .forEach(System.out::println);
        }
    }
}
