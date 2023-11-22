package com.example.emailVerificationPractice.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdSuscriber {
    @javax.persistence.Id
    @SequenceGenerator(
            name = "announcement_sequence",
            sequenceName = "announcement_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator =  "announcement_sequence"
    )

    private Long Id;
    private String personName;
    private String status;
    private String phoneNumber;
    private String roomNo;
    private String department;
    private String activity;

}
