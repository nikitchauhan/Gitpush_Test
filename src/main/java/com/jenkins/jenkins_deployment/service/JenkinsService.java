package com.jenkins.jenkins_deployment.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ResourceBundle;

@Service
public class JenkinsService {



    public ResponseEntity<?> test()
    {
        return ResponseEntity.ok("Working JENKINS");
    }
}
