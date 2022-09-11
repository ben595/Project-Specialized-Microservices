package com.hoang.StudentService.controllers;

import com.hoang.StudentService.models.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class StudentController {
    // Fake data
    private Student[] students = {
            new Student("S1", "An"),
            new Student("S2", "Bảo"),
            new Student("S3", "Cường")
    };

    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public Student[] getAllStudents() {
        RestTemplate restTemplate = new RestTemplate(); // Generate HTTP request
        for(var i = 0; i < students.length; i++) {
            Student student = students[i];
            String url = "http://localhost:9999/scores/student/" + student.getId();
            int score = restTemplate.getForObject(url, Integer.class);
            student.setScore(score);
        }

        return students;
    }
}
