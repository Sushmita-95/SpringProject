package com.project.spring.controllers;

import com.project.spring.DAO.InstructorDAO;
import com.project.spring.entity.Instructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class InstructorController {

	@Autowired
	private InstructorDAO instructorDAO;

	@RequestMapping("/instructor")
	public String getInstructorInfo(Model model) {

		List<Instructor> instructors = instructorDAO.findAllInstructors();
		model.addAttribute("instructorList", instructors);

		return "instructor";
	}
	
	
	

}
