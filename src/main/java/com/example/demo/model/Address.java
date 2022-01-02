package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Entity
@Getter
@Setter
@Table(name="adresses")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    @Pattern(regexp = "[A-Z-a-z\\s\\d]{1,}")
    private String street;

    @NotBlank
    @Pattern(regexp ="[A-Za-z0-9\\s\\d]{1,}")
    private String houseNumber;

    @NotBlank
    @Pattern(regexp="[A-Za-z\\s\\d]{1,}")
    private String city;

    @NotBlank
    @Pattern(regexp="[A-Za-z\\s\\d]{1,}")
    private String countryState;

    @NotBlank
    @Pattern(regexp="[0-9][0-9]-[0-9][0-9][0-9]")  //Polish postcode regex pattern
    private String postCode;

    @NotBlank
    @Pattern(regexp ="[A-Za-z\\s\\d]{1,}")
    private String country;

    @OneToOne(targetEntity = Student.class)
    @JoinColumn(name = "student_id")
    private Student student;

    public Address(String street,
                   String houseNumber,
                   String city,
                   String countryState,
                   String postCode,
                   String country,
                   Student student) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.city = city;
        this.countryState = countryState;
        this.postCode = postCode;
        this.country = country;
        this.student = student;
    }
    public Address(){ }
}
