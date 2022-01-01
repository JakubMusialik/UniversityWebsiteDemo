package com.example.demo.controller;



import com.example.demo.model.Document;
import com.example.demo.service.document.DocumentServiceImpl;
import com.example.demo.service.student.StudentServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;



@Controller
@RequiredArgsConstructor
@RequestMapping("/register/docs/")
public class DocumentController {

    private final DocumentServiceImpl documentService;
    private final StudentServiceImpl studentService;

    @GetMapping
    public String getDocuments(Model model){
        model.addAttribute("document", new Document());
        return "registrationFormDocs";
    }

    @PostMapping
    public String getDocuments(@ModelAttribute("document") @Valid Document document, BindingResult result){
        if(result.hasErrors()){
            return "registrationFormDocs";
        }else{
            documentService.addDocument(document);
            return"redirect:/register/address";
        }
    }
}