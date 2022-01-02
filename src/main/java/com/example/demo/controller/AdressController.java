package com.example.demo.controller;


import com.example.demo.model.Address;
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
public class AdressController {

    private final AddressServiceImpl addressService;

    @GetMapping
    public String getAddress(Model model){
        model.addAttribute("address", new Address());
        return "registrationFormAddress";
    }
    @PostMapping
    public String addAddress(@ModelAttribute("address")@RequestParam("studentId") long  id, @Valid Address address, BindingResult result) {
        if (result.hasErrors()) {
            return "registrationFormAddress";
        } else {
            addressService.addAddress(address);
            return "redirect:/";
        }
    }
}