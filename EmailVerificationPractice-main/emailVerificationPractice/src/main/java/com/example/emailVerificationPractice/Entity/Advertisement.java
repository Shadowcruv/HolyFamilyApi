package com.example.emailVerificationPractice.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Advertisement {
    @javax.persistence.Id
    @SequenceGenerator(
            name = "advertisement_sequence",
            sequenceName = "advertisement_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator =  "advertisement_sequence"
    )

    private Long Id;
    private String heading;
    private LocalDate dateDuration;
    private String details;
    private String uniqueNo;
}
