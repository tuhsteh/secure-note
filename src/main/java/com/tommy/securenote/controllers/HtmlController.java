package com.tommy.securenote.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import static com.tommy.securenote.constants.Constants.INDEX;
import static com.tommy.securenote.constants.Constants.FETCH_NOTE;
import static com.tommy.securenote.constants.Constants.NOTE_ID;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class HtmlController {


    @RequestMapping(value = INDEX)
    public String index(){
        return "/home";
    }

    // Create

    // Fetch
    @RequestMapping(value = FETCH_NOTE, params = {NOTE_ID}, method = GET)
    public String getNote(){
        return "/note";
    }

}