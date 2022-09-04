package com.greatlearning.library.controller;

import com.greatlearning.library.model.GreatLearning;
import com.greatlearning.library.serviceimpl.ExampleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class ExampleController {

    @Autowired   //Injecting Service Objects
    ExampleServiceImpl exampleService;

    @GetMapping("/info")
//    @ResponseBody
    public GreatLearning get(){
        return exampleService.get();
    }
    @GetMapping("/Hello")
    public String getHello(){
        return "Hello World!!!";
    }

    @PostMapping("customInfo")
    public GreatLearning customInfo(String courseName,String courseType, String tutorFirstName,String tutorLastName){
        return exampleService.customInfo(courseName,courseType,tutorFirstName,tutorLastName);
    }
}
