package com.greatlearning.library.serviceimpl;

import com.greatlearning.library.model.FullName;
import com.greatlearning.library.model.GreatLearning;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ExampleServiceImpl implements  com.greatlearning.library.service.ExampleService {
    @Override
    public GreatLearning get(){
        log.info("Inside get() method");
        GreatLearning gl = new GreatLearning();
        gl.setCourseName("Spring APIs");
        gl.setCourseType("Backend Development");
        gl.setCourseTutor("JK-Rest");
        gl.setFullName(FullName.builder().firstName("jayaa").lastName("krishna").build());
        return gl;
    }
    @Override
    public GreatLearning customInfo(String courseName, String courseType, String firstName, String lastName){
        log.info("Inside customInfo() method");
        GreatLearning gl = new GreatLearning();
        gl.setCourseName(courseName);
        gl.setCourseType(courseType);
        gl.setCourseTutor(firstName);
        gl.setFullName(FullName.builder().firstName(firstName).lastName(lastName).build());
        return gl;
    }
}
