package com.tqpp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.tqpp.dao.StudentRepository;
import com.tqpp.model.Student;

@Controller
public class StudentController {

	@Autowired
	private StudentRepository studentrepo;
	
	@GetMapping("/")
	public String viewall(Model model)
	{ 
		List<Student> slist=studentrepo.findAll();
		model.addAttribute("listStudent",slist);
		return "studentlist";
	}
	
	@GetMapping(value="/edit/{sid}")
	public String editStud(@PathVariable("sid") int sid,Model m)
	{
		Student ob=studentrepo.findById(sid).orElse(null);
		m.addAttribute("student", ob);
		return "AddStud";
	}
	
	@PostMapping(value="/save")
	public String saveedit(@ModelAttribute("s") Student ob)
	{
		studentrepo.save(ob);
		return "redirect:/";
	}
	
	@GetMapping(value="/delete/{sid}")
	public String deleteStud(@PathVariable("sid") int sid,Model m)
	{
		studentrepo.deleteById(sid);
		return "redirect:/";
	}
}
