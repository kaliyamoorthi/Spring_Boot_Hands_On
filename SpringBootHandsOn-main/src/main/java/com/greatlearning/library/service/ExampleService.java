package com.greatlearning.library.service;

import com.greatlearning.library.model.GreatLearning;
import org.springframework.stereotype.Component;

@Component
public interface ExampleService {
    GreatLearning get();

    GreatLearning customInfo(String courseName, String courseType, String firstName, String lastName);
}
