package com.dzhenetl;

import com.dzhenetl.entity.Department;
import com.dzhenetl.entity.Employee;
import com.dzhenetl.util.SessionManager;
import org.hibernate.Session;

public class TestBiDirectional {
    public static void main(String[] args) {
        try (Session session = SessionManager.getSession()) {

//            Department department = session.get(Department.class, 2);
//            System.out.println(department);
//            department.getEmployees().forEach(System.out::println);

        }
    }

    private static void deleteEmployee(Session session, int id) {
        Employee employee = session.get(Employee.class, id);
        session.beginTransaction();
        session.delete(employee);
        session.getTransaction().commit();
    }

    private static void createDepartment(Session session) {
        Department department = new Department("IT", 300, 1200);
        Employee employee1 = new Employee("Ivan", "Ivanov", 800);
        Employee employee2 = new Employee("Elena", "Smirnova", 1000);
        department.addEmployee(employee1, employee2);
        session.beginTransaction();
        session.save(department);
        session.getTransaction().commit();
    }
}
