package com.example.universitymanagement.controller;

import com.example.universitymanagement.model.Professor;
import com.example.universitymanagement.repository.UniversityRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

import com.example.universitymanagement.service.UniversityService;
import com.example.universitymanagement.model.University;

@RestController
@RequestMapping("/api/universitymanagement/university")
public class UniversityController {
    private final UniversityService universityService;
    private final UniversityRepository universityRepository;

    public UniversityController(UniversityService universityService, UniversityRepository universityRepository) {
        this.universityService = universityService;
        this.universityRepository = universityRepository;
    }

    @PostMapping // "/university" емес, негізгі route-ты қолданамыз
    public String addUniversity(@RequestBody University university) {
        universityRepository.save(university);
        return "University added successfully!";
    }

    @GetMapping
    public List<University> getAllUniversities() {
        return universityService.getAllUniversities();
    }
}

