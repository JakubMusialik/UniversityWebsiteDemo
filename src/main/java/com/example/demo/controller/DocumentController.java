package com.example.demo.controller;



import com.example.demo.model.Document;
import com.example.demo.model.Student;
import com.example.demo.service.document.DocumentServiceImpl;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import javax.validation.Valid;



@Controller
@RequiredArgsConstructor
@RequestMapping("/register/docs")
public class DocumentController {

    private final DocumentServiceImpl documentService;



    @GetMapping
    public String getDocuments(@ModelAttribute("studentDocs") Student student, Model model){
        Document document = new Document();
        document.setStudent(student);
        model.addAttribute("document", document);
        return "registrationFormDocs";
    }

    @PostMapping
    public String getDocuments(@ModelAttribute("document") @Valid Document document,Student student,
                               BindingResult result, RedirectAttributes redirectAttributes){
        if(result.hasErrors()){
            return "registrationFormDocs";
        }else{
            redirectAttributes.addFlashAttribute("studentAddress",student);
            documentService.addDocument(document);
            return"redirect:/register/address";
        }
    }
}