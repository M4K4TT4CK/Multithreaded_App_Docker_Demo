package edu.wgu.d387_sample_code.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@CrossOrigin(origins = "http://localhost:4200")
public class TimeZoneConversionController {

    @GetMapping("/presentation")
    public ResponseEntity<String> presentationDisplay(){
        String display = "The presentation will begin at: ";
        return new ResponseEntity<String> (display, HttpStatus.OK);
    }
}
