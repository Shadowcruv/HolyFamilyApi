package com.example.emailVerificationPractice.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecentActivity {
    @javax.persistence.Id
    @SequenceGenerator(
            name = "recent_activity_sequence",
            sequenceName = "recent_activity_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator =  "recent_activity_sequence"
    )

    private Long Id;
    private Object object;
    private LocalDate date;
}
