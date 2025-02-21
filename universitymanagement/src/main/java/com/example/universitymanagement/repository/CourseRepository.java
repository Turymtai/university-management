package com.example.universitymanagement.repository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.universitymanagement.model.Course;
import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> { }

