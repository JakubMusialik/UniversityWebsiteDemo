package com.example.demo.controller;


import com.example.demo.model.Address;

import com.example.demo.model.Student;
import com.example.demo.service.address.AddressServiceImpl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@Controller
@RequiredArgsConstructor
@RequestMapping("/register/address")
public class AddressController {

    private final AddressServiceImpl addressService;

    @GetMapping
    public String getAddress(@ModelAttribute("studentAddress") Student student, Model model) {
        Address address = new Address();
        address.setStudent(student);
        model.addAttribute("address", address);
        return "registrationFormAddress";
    }

    @PostMapping
    public String addAddress(@ModelAttribute("address") @Valid Address address, BindingResult result) {
        if (result.hasErrors()) {
            return "registrationFormAddress";
        } else {
            addressService.addAddress(address);
            return "redirect:/";
        }
    }
}