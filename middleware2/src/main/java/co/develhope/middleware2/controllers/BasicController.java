package co.develhope.middleware2.controllers;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    public String greeting() {
        return "Welcome user!";
    }

}
