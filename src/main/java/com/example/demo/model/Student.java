package com.example.demo.model;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cascade;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    @Pattern(regexp = "[A-Za-z\\s\\d]{1,20}")
    private String firstName;

    @NotBlank
    @Pattern(regexp = "[A-Za-z\\s\\d]{1,20}")
    private String lastName;

    @NotBlank
    @Pattern(regexp = "[0-9]{9}") //regex pattern for polish phone number
    private String phoneNumber;

    @NotBlank
    @Pattern(regexp = "[_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.([a-zA-Z]{2,}){1}")
    private String email;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "student")
    private List<Document> documentList = new ArrayList<>();

    public Student(String firstName,
                   String lastName,
                   String phoneNumber,
                   String email,
                   List<Document> documentList) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.documentList = documentList;
    }

    public Student() {
    }
}