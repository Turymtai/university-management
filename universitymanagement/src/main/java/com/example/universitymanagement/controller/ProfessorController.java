package com.example.universitymanagement.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

import com.example.universitymanagement.service.ProfessorService;
import com.example.universitymanagement.model.Professor;
@RestController
@RequestMapping("/api/universitymanagement/professor")
public class ProfessorController {

    @Autowired
    private ProfessorService professorService;

    @GetMapping
    public List<Professor> getAllProfessors() {
        return professorService.getAllProfessors();
    }
}
