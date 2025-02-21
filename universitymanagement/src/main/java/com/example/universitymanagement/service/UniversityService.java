package com.example.universitymanagement.service;

import com.example.universitymanagement.model.University;
import com.example.universitymanagement.repository.UniversityRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UniversityService {
    private final UniversityRepository universityRepository;

    public UniversityService(UniversityRepository universityRepository) {
        this.universityRepository = universityRepository;
    }

    public List<University> getAllUniversities() {
        return universityRepository.findAll();
    }
}
