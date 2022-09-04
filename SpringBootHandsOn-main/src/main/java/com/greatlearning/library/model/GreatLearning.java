package com.greatlearning.library.model;

import lombok.*;

//@Setter
//@Getter
//@ToString
//@RequiredArgsConstructor
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GreatLearning {
    private String courseName;
    private String courseType;
    private String courseTutor;
    private FullName fullName;
}
