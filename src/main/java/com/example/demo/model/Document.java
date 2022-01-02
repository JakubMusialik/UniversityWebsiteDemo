package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;


@Entity
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
    @JoinColumn(name = "student_id")
    private Student student;

    public Document(String documentName,
                    String description) {
        this.documentName = documentName;
        this.description = description;
    }

    public Document() {
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}