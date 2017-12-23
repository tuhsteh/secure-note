package com.tommy.securenote.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import static com.tommy.securenote.Constants.Constants.INDEX;
import static com.tommy.securenote.Constants.Constants.FETCH_NOTE;
import static com.tommy.securenote.Constants.Constants.CREATE_NOTE;
@Controller
public class IndexController {


    @RequestMapping(INDEX)
    public String index(){
        return "<h1>helloWorld</h1";
    }

    // Create

    // Fetch




}
