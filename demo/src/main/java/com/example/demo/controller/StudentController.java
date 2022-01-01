package com.example.demo.controller;


import com.example.demo.model.Student;
import com.example.demo.service.student.StudentServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;



import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
@RequestMapping("/register")
public class StudentController {

    private final StudentServiceImpl studentService;

    @GetMapping
    public String registrationForm(Model model){
        model.addAttribute("student", new Student());
        return "registrationForm";
    }

    @PostMapping
    public String addAddress(@ModelAttribute("student") @Valid Student student, BindingResult result) {
        if (result.hasErrors()) {
            return "registrationForm";
        } else {
            studentService.addStudent(student);
            return "redirect:/register/docs";
        }
    }
}