package com.javatechie.github;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitHubLastDemoApplication {

    @GetMapping("/fetch")
    public String getDetails(){

        return "Welcome To India";
    }
    public static void main(String[] args) {
        SpringApplication.run(GitHubLastDemoApplication.class, args);
    }

}
