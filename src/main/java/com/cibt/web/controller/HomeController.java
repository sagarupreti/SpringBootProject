/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.web.controller;

import com.cibt.web.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author ideapad-520S
 */
@Controller
@RequestMapping(value = "/")
public class HomeController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping()
    public String index(Model model) {
        model.addAttribute("students", 
                studentRepository.getSelectedStudents());
        model.addAttribute("name", "Spring Boot Project");
        return "index";
    }

    @GetMapping(value = "/about")
    @ResponseBody
    public String about() {
        return "<h1>About us</h1>";

    }
}
