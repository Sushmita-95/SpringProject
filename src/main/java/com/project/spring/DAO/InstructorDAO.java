package com.project.spring.DAO;

import com.project.spring.entity.Instructor;

import java.util.List;


public interface InstructorDAO {

        List<Instructor> findAllInstructors();


}
