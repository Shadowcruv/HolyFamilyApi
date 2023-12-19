package com.example.emailVerificationPractice.Controller;


import com.example.emailVerificationPractice.Entity.*;
import com.example.emailVerificationPractice.Service.*;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5501")
@RequestMapping("/admin-report-page")
@RestController
public class AdminWebPageReport {

    private final ElectricalIssuesServiceImp electricalIssuesServiceImp;
    private final CarpentryIssuesServiceImp carpentryIssuesServiceImp;
    private final PlumbingIssuesServiceImp plumbingIssuesServiceImp;
    private final OthersServiceImp othersServiceImp;
    private final WindowIssuesServiceImp windowIssuesServiceImp;

    public AdminWebPageReport(ElectricalIssuesServiceImp electricalIssuesService1, ElectricalIssuesServiceImp electricalIssuesServiceImp, CarpentryIssuesServiceImp carpentryIssuesServiceImp, PlumbingIssuesServiceImp plumbingIssuesServiceImp, OthersServiceImp othersServiceImp, WindowIssuesServiceImp windowIssuesServiceImp) {
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

    @DeleteMapping("delete-electrical-issue/{id}")
    public void deleteElectricalIssuesById(@PathVariable Long id) {
        electricalIssuesServiceImp.deleteElectricalIssues(id);
    }

    @GetMapping("view-carpentry-issues")
    public List<CarpentryIssues> getCarpentryAll(){
        return carpentryIssuesServiceImp.getCarpentryIssues();
    }

    @DeleteMapping("delete-carpentry-issue/{id}")
    public void deleteCapentryIssuesById(@PathVariable Long id) {
        carpentryIssuesServiceImp.deleteCarpentryIssue(id);
    }
    @GetMapping("view-window-issues")
    public List<WindowIssues> getWindowAll(){
        return windowIssuesServiceImp.getWindowIssues();
    }

    @DeleteMapping("delete-window-issue/{id}")
    public void deleteWindowIssuesById(@PathVariable Long id) {
        windowIssuesServiceImp.deleteWindowIssues(id);
    }
    @GetMapping("view-others-issues")
    public List<Others> getOthersAll(){
        return othersServiceImp.getOthersIssues();
    }
    @DeleteMapping("delete-others-issue/{id}")
    public void deleteOthersById(@PathVariable Long id) {
        othersServiceImp.deleteOthersIssues(id);
    }

    @GetMapping("view-plumbing-issues")
    public List<PlumbingIssues> getPlumbingAll(){
        return plumbingIssuesServiceImp.getPlumbingIssues();
    }

    @DeleteMapping("delete-plumbing-issues/{id}")
    public void deletePlumbingIssuesById(@PathVariable Long id) {
        othersServiceImp.deleteOthersIssues(id);
    }
}
