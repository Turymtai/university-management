package com.example.universitymanagement.controller;

import com.example.universitymanagement.model.Professor;
import com.example.universitymanagement.repository.ProfessorRepository;
import com.example.universitymanagement.service.ProfessorService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController
@RequestMapping("/api/universitymanagement/professor")
public class ProfessorController {

    private final ProfessorService professorService;
    private final ProfessorRepository professorRepository;

    @Autowired
    public ProfessorController(ProfessorService professorService, ProfessorRepository professorRepository) {
        this.professorService = professorService;
        this.professorRepository = professorRepository;
    }

    @PostMapping
    public String addProfessor(@RequestBody Professor professor) {
        professorRepository.save(professor);
        return "Professor added successfully!";
    }

    @GetMapping
    public List<Professor> getAllProfessors() {
        return professorService.getAllProfessors();
    }
}
