package com.spring_boot;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentid;
    private String firstName;
    private String lastName;
    private String gender;
    private String birthDate;
    private String birthPlace;
    private String birthCountry;
    private String nationality;
    private String nativeLanguageParents;
    private String smartphoneNumber;
    private String phoneNumber;
    private String emailAddress;
    private Boolean photoPermission;

    private String postalCode;
    private String place;
    private String street;
    private String houseNumber;
    private String addressExtension;

    private String emergencyContact;
    private String emergencyContactNumber;

    private String motherFirstName;
    private String motherLastName;
    private String motherPhoneNumber;

    private String fatherFirstName;
    private String fatherLastName;
    private String fatherPhoneNumber;

    private String parentsAddress;

    private String guardianFirstName;
    private String guardianLastName;
    private String guardianPhoneNumber;

    private String apprenticeship;
    private String firmName;
    private String firmStreet;
    private String firmHouseNumber;
    private String firmContact;
    private String firmPhoneNumber;
    private String firmFax;
    private String firmEmailAddress;

    private String schoolDaysFirst;
    private String schoolDaysSecond;
    private String educationLevel;
    private String lastSchool;
    private String finishedCourse;
    private Integer graduationYear;

    private String workEducation;
    private String schoolRelation;
    private String apprenticeshipContract;
    private LocalDateTime createdAt;
}

