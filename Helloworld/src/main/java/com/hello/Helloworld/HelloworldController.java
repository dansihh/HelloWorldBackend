package com.hello.Helloworld;


import org.springframework.web.bind.annotation.*;

@RestController
public class HelloworldController {

    @CrossOrigin(origins = {"http://localhost:3000"})

    @RequestMapping("/")
    public String shelloWorld()
    {
        return "Hello World";
    }


}
