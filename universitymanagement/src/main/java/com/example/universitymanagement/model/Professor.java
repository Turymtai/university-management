package com.example.universitymanagement.model;

import jakarta.persistence.*;

@Entity
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String department;
    private Long universityId; // Университеттің ID-сі

    // Конструкторлар
    public Professor() {}

    public Professor(String name, String department, Long universityId) {
        this.name = name;
        this.department = department;
        this.universityId = universityId;
    }

    // Геттер мен сеттер
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public Long getUniversityId() { return universityId; }
    public void setUniversityId(Long universityId) { this.universityId = universityId; }
}
