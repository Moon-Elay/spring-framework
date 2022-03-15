package com.cydeo.controller;

import com.cydeo.enums.Gender;
import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MentorController {
   @RequestMapping("/mentor")
    public String mentorPage(Model model){
       List<Mentor> mentorList = new ArrayList<>();
       mentorList.add(new Mentor("David", "Sari", 7, Gender.Male));
       mentorList.add(new Mentor("Davin", "Sari", 7, Gender.Male));
       mentorList.add(new Mentor("Aysel", "Sari", 31, Gender.Female));
       model.addAttribute("mentors", mentorList);
        return "/mentors/mentor";
    }


}
