package com.example.universitymanagement.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

import com.example.universitymanagement.service.CourseService;
import com.example.universitymanagement.model.Course;

@RestController
@RequestMapping("/api/universitymanagement/course")
public class CourseController {
    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }
}

