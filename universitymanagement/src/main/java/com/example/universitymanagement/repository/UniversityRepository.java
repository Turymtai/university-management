package com.example.universitymanagement.repository;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.universitymanagement.model.University;
@Repository
public interface UniversityRepository extends JpaRepository<University, Long> { }

