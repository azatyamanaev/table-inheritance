package ru.itis.tableinheritance.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.itis.tableinheritance.repositories.HumansRepository;
import ru.itis.tableinheritance.repositories.StudentsRepository;
import ru.itis.tableinheritance.repositories.UniversitiesRepository;

@Controller
public class DataController {

    @Autowired
    private UniversitiesRepository universitiesRepository;
    @Autowired
    private HumansRepository humansRepository;
    @Autowired
    private StudentsRepository studentsRepository;



    @RequestMapping(value = "/data", method = RequestMethod.GET)
    public String getDataPage(Model model) {
        model.addAttribute("students", studentsRepository.findAll());
        model.addAttribute("humans", humansRepository.findAll());
        model.addAttribute("universities", universitiesRepository.findAll());
        return "data";
    }
}
