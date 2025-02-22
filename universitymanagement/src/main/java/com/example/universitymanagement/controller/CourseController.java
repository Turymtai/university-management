package com.example.universitymanagement.controller;

import com.example.universitymanagement.model.Course;
import com.example.universitymanagement.repository.CourseRepository;
import com.example.universitymanagement.service.CourseService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController
@RequestMapping("/api/universitymanagement/course")
public class CourseController {

    private final CourseService courseService;
    private final CourseRepository courseRepository;

    @Autowired
    public CourseController(CourseService courseService, CourseRepository courseRepository) {
        this.courseService = courseService;
        this.courseRepository = courseRepository;
    }

    @PostMapping
    public String addCourse(@RequestBody Course course) {
        courseRepository.save(course);
        return "Course added successfully!";
    }

    @GetMapping
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }
}
