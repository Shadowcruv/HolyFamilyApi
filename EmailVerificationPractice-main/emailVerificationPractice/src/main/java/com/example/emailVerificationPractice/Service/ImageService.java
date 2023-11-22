//package com.example.emailVerificationPractice.Service;
//
//
//import com.google.auth.oauth2.GoogleCredentials;
//import com.google.cloud.storage.Blob;
//import com.google.cloud.storage.Bucket;
//import com.google.firebase.FirebaseApp;
//import com.google.firebase.FirebaseOptions;
//import com.google.firebase.cloud.StorageClient;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.Resource;
//import org.springframework.stereotype.Service;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.InputStream;
//@Service
//public class ImageService {
//
//
//    private final Bucket bucket;
//
//    public ImageService() throws IOException{
//        //src/main/resources/memegenuis-c64bf-firebase-adminsdk-mflk6-059fe9532f.json
//        Resource resource = new ClassPathResource("memegenuis-c64bf-firebase-adminsdk-mflk6-059fe9532f.json");
//        InputStream serviceAccount = resource.getInputStream();
//
//        FirebaseOptions options = new FirebaseOptions.Builder()
//                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
////                .setDatabaseUrl("https://your-firebase-project.firebaseio.com")
//                .setStorageBucket("memegenuis-c64bf.appspot.com")
//                .build();
//        // Initialize Firebase
//        FirebaseApp.initializeApp();
//
//        //Get the default storage bucket
//        this.bucket = StorageClient.getInstance().bucket();
//
//    }
//
//    public void uploadImage(MultipartFile file) throws IOException{
//        String fileName = file.getOriginalFilename();
//        InputStream content = file.getInputStream();
//        Blob blob = bucket.create(fileName, content, file.getContentType());
//    }
//
//
//}
