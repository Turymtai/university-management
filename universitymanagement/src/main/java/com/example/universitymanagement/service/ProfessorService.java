package com.example.universitymanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.universitymanagement.repository.ProfessorRepository;
import com.example.universitymanagement.model.Professor;
import java.util.List;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository professorRepository;

    public List<Professor> getAllProfessors() {
        return professorRepository.findAll();
    }
}

