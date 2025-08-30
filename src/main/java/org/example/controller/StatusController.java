package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/status")
@RequiredArgsConstructor
public class StatusController {
    private static final String VERSION = "1.0.0";

    @GetMapping
    public String home() {

        return "Hello World Version " + VERSION;
    }

}
