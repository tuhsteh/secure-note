package com.tommy.securenote.controllers;

import com.tommy.securenote.resources.GreetingResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

//    @RequestMapping(value = "/greeting",method = RequestMethod.GET)
    @RequestMapping("/greeting")  // when not specifying method, this handles all methods
    public GreetingResource greeting(
            @RequestParam(value = "name", defaultValue = "World") String name
    ) {
        return new GreetingResource(
                counter.incrementAndGet(),
                String.format(template, name));
    }
}
