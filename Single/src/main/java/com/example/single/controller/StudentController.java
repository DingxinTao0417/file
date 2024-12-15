package com.example.single.controller;

import com.example.single.entity.Student;
import com.example.single.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @RequestMapping("/student/info")
    public Student studentInfo(@RequestParam(name = "studentId") BigInteger studentId) {
        return service.getStudentInfoById(studentId);
    }

    @RequestMapping("/student/all")
    public List<Student> studentAll() {
        return service.getAllStudentInfo();
    }

    @RequestMapping("/student/create")
    public String studentCreate(@RequestParam(name = "name") String name,
                                @RequestParam(name = "gender") Integer gender) {
        int result = service.createStudent(name, gender);
        return 1 == result ? "成功" : "失败";
    }

    @RequestMapping("/student/update")
    public String studentUpdate(@RequestParam(name = "studentId") BigInteger studentId,
                                @RequestParam(name = "name") String name,
                                @RequestParam(name = "gender") Integer gender) {
        int result = service.updateStudent(studentId, name, gender);
        return 1 == result ? "成功" : "失败";
    }

    @RequestMapping("/student/delete")
    public String studentDelete(@RequestParam(name = "studentId") BigInteger studentId) {
        int result = service.deleteStudent(studentId);
        return 1 == result ? "成功" : "失败";
    }
}
