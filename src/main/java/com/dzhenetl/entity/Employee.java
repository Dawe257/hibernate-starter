package com.dzhenetl.entity;

import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@ToString
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String surname;
    private Integer salary;

//    @ToString.Exclude
//    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.DETACH,
//            CascadeType.REFRESH, CascadeType.MERGE})
//    @JoinColumn(name = "department_id")
//    private Department department;

    public Employee() {
    }

    public Employee(String name, String surname, Integer salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

}
