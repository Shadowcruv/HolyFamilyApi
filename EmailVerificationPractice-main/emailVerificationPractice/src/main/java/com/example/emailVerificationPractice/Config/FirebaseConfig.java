//package com.example.emailVerificationPractice.Config;
//
//import com.google.auth.oauth2.GoogleCredentials;
//import com.google.firebase.FirebaseApp;
//import com.google.firebase.FirebaseOptions;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.ClassPathResource;
//
//import java.io.IOException;
//
//@Configuration
//public class FirebaseConfig {
//
//    @Bean
//    public FirebaseApp firebaseApp() throws IOException {
//        ClassPathResource serviceAccount = new ClassPathResource("memegenuis-c64bf-firebase-adminsdk-mflk6-059fe9532f");
//        FirebaseOptions options = new FirebaseOptions.Builder().
//                setCredentials(GoogleCredentials.fromStream(serviceAccount.getInputStream()))
//                .build();
//
//        return FirebaseApp.initializeApp(options);
//    }
//
//
//}
