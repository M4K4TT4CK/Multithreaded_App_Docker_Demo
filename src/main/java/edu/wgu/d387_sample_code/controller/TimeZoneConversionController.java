package edu.wgu.d387_sample_code.controller;

import org.apache.tomcat.jni.Time;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TimeZoneConversionController {

    @GetMapping("/presentation")
    public ResponseEntity<String> presentationDisplay(){

        String displayTime = "Join us for an online presentation at the Landon Hotel at on 14 NOV 2023 at " + TimeZoneConversion.getTime() + ".";
        return new ResponseEntity<String>(displayTime, HttpStatus.OK);
    }
}
