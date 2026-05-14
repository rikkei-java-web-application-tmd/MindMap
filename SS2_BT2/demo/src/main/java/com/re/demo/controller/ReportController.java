package com.re.demo.controller;

import com.re.demo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@Controller
public class ReportController {

    @GetMapping("/report")
    public String showReport(@RequestParam(value = "search", defaultValue = "Tat ca") String search, Model model) {
        List<Student> students = Arrays.asList(
                new Student(1, "Nguyen Van A", 8.5),
                new Student(2, "Tran Thi B", 4.0),
                new Student(3, "Le Van C", 9.0)
        );
        model.addAttribute("students", students);
        model.addAttribute("search", search);
        return "report";
    }
}

