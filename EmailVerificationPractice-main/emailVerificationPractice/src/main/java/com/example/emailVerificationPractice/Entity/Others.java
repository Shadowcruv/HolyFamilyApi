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
public class Others {
    @javax.persistence.Id
    @SequenceGenerator(
            name = "api_user_sequence",
            sequenceName = "api_user_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator =  "api_user_sequence"
    )

    private Long Id;
    private String userName;
    private String phoneNumber;
    private String Issue;
}
