package com.example.emailVerificationPractice.Controller;


import com.example.emailVerificationPractice.Entity.*;
import com.example.emailVerificationPractice.Service.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/adminpage")
@RestController
public class AdminReportPage {

    private final ElectricalIssuesServiceImp electricalIssuesServiceImp;
    private final CarpentryIssuesServiceImp carpentryIssuesServiceImp;
    private final PlumbingIssuesServiceImp plumbingIssuesServiceImp;
    private final OthersServiceImp othersServiceImp;
    private final WindowIssuesServiceImp windowIssuesServiceImp;

    public AdminReportPage(ElectricalIssuesServiceImp electricalIssuesService1, ElectricalIssuesServiceImp electricalIssuesServiceImp, CarpentryIssuesServiceImp carpentryIssuesServiceImp, PlumbingIssuesServiceImp plumbingIssuesServiceImp, OthersServiceImp othersServiceImp, WindowIssuesServiceImp windowIssuesServiceImp) {
        this.electricalIssuesServiceImp = electricalIssuesServiceImp;
        this.carpentryIssuesServiceImp = carpentryIssuesServiceImp;
        this.plumbingIssuesServiceImp = plumbingIssuesServiceImp;
        this.othersServiceImp = othersServiceImp;
        this.windowIssuesServiceImp = windowIssuesServiceImp;
    }

    @GetMapping("view-electrical-issues")
    public List<ElectricalIssues> getElectricalAll(){
        return electricalIssuesServiceImp.getElectricalIssues();
    }

    @GetMapping("view-carpentry-issues")
    public List<CarpentryIssues> getCarpentryAll(){
        return carpentryIssuesServiceImp.getCarpentryIssues();
    }

    @GetMapping("view-window-issues")
    public List<WindowIssues> getWindowAll(){
        return windowIssuesServiceImp.getWindowIssues();
    }

    @GetMapping("view-others-issues")
    public List<Others> getOthersAll(){
        return othersServiceImp.getOthersIssues();
    }

    @GetMapping("view-plumbing-issues")
    public List<PlumbingIssues> getPlumbingAll(){
        return plumbingIssuesServiceImp.getPlumbingIssues();
    }
}
