package com.jenkins.jenkins_deployment.controller;


import com.jenkins.jenkins_deployment.service.JenkinsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

   @Autowired
   JenkinsService jenkinsService;

   public ResponseEntity<?> testing()
   {
       return  jenkinsService.test();
   }

}
