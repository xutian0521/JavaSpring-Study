package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("Person")
public class PersonController {
    private PersonRepository _personRepository;

    public PersonController(PersonRepository personRepository)
    {
        super();
        this._personRepository =personRepository;
    }
    @RequestMapping("All")
    public String All(Model model)
    {
        List<Person> persons= this._personRepository.findAll();
        model.addAttribute("persons", persons);
        return  "ALl";
    }
}
