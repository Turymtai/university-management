package com.example.universitymanagement.model;

import jakarta.persistence.*;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

    private Long professorId;
    private Long universityId;

    // Конструкторлар
    public Course() {}

    public Course(String name, String description, Long professorId, Long universityId) {
        this.name = name;
        this.description = description;
        this.professorId = professorId;
        this.universityId = universityId;
    }

    // Геттер мен сеттер
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Long getProfessorId() { return professorId; }
    public void setProfessorId(Long professorId) { this.professorId = professorId; }

    public Long getUniversityId() { return universityId; }
    public void setUniversityId(Long universityId) { this.universityId = universityId; }
}
