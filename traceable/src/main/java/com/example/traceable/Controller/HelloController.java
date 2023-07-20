package com.example.traceable.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/getmsg")
    public ResponseEntity<String> getActiveOrder(){
        String output = "Hello World";

        return ResponseEntity.of(Optional.of(output));
    }

}
