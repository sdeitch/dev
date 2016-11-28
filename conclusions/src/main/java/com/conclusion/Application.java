package com.conclusion;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication myApp = new SpringApplication(Application.class);

        myApp.setBannerMode(Banner.Mode.OFF);
        myApp.run(args);
    }
}
