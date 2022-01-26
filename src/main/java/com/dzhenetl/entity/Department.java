package com.dzhenetl.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@ToString
@Getter
@Setter
@Entity
@Table(name = "department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Column(name = "min_salary")
    private Integer minSalary;
    @Column(name = "max_salary")
    private Integer maxSalary;

    @ToString.Exclude
    @OneToMany(cascade = CascadeType.ALL)//, mappedBy = "department")
    @JoinColumn(name = "department_id")
    private List<Employee> employees;

    public Department() {}

    public Department(String name, Integer minSalary, Integer maxSalary) {
        this.name = name;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
    }

    public void addEmployee(Employee ... employee) {
        if (employees == null) employees = new ArrayList<>();
        employees.addAll(List.of(employee));
    }

}
