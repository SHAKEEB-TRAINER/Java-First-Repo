package com.example.MySecondApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Specks {

    @RequestMapping(value = "/Glasses",method = RequestMethod.GET)
    public List<String> getAllGlass(){


        return List.of("SUN GLASES","MOON GLASES","REBN GLASES");
    }
    
    @RequestMapping(value = "/Getallframe",method = RequestMethod.GET)
    public List<String> getAllframe(){


        return List.of("metal frame","silver frame","gold frame");
        
    }
}
