package com.example.emailVerificationPractice.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ApiUser {
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
    private String password;


    //TODO: Update1 : add more properties of the ApiUser

    private String urlPic;
    private String roomNo;
    private String firstName;
    private String lastName;
    private String school;
    private String faculty;
    private String department;
    private String level;
    private Boolean enabled = false;


    @ManyToMany(fetch = FetchType.EAGER,
            cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    }
   )
    private Collection<ApiRole> authoritiess;



//    public ApiUser( String userName, String password, Collection<ApiRole> authoritiess, Boolean enabled) {
//
//        this.userName = userName;
//        this.password = password;
//        this.authoritiess = authoritiess;
//        this.enabled = enabled;
//    }
//
//    public ApiUser(String firstName, String lastName,
//                   String school, String faculty, String department,
//                   String level) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.school = school;
//        this.faculty = faculty;
//        this.department = department;
//        this.level = level;
//    }


    //TODO Encode the Url,
    // check for email validity
    //  understand how that controller works for a user logging in so that he wouldn't bypass into another user's account
    //  work on update user details
    //  if conditions
    // Attach a room entity to a user;
}
