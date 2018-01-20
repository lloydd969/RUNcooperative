package com.project.runcooperative.web.controllers.viewcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EditpersonnelController {

    @RequestMapping(value = "/edit/personnel", method = RequestMethod.GET)
    public String ShowEditUserTablePage(){

        return "editpersonnel";
    }
}
