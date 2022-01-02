package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;


@Entity
@Getter
@Setter
@Table(name = "documents")
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    @Pattern(regexp = "[A-Za-z\\s\\d]{1,}")
    private String documentName;

    @NotBlank
    @Pattern(regexp = "[A-Za-z\\s\\d]{1,}")
    private String description;

    @ManyToOne(targetEntity = Student.class)
    private Student student;

    public Document(String documentName,
                    String description,
                    Student student) {
        this.documentName = documentName;
        this.description = description;
        this.student = student;
    }

    public Document() {
    }
}