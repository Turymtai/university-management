package com.example.universitymanagement.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import com.example.universitymanagement.service.UniversityService;
import com.example.universitymanagement.service.CourseService;
import com.example.universitymanagement.service.ProfessorService;
import com.example.universitymanagement.model.University;
import com.example.universitymanagement.model.Course;
import com.example.universitymanagement.model.Professor;

@RestController
@RequestMapping("/api/universitymanagement/all")
public class MainController {

    @Autowired
    private UniversityService universityService;

    @Autowired
    private CourseService courseService;

    @Autowired
    private ProfessorService professorService;

    @GetMapping
    public Map<String, Object> getAllData() {
        Map<String, Object> response = new HashMap<>();
        response.put("universities", universityService.getAllUniversities());
        response.put("courses", courseService.getAllCourses());
        response.put("professors", professorService.getAllProfessors());
        return response;
    }
}
