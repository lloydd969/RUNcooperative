package com.project.runcooperative.web.controllers.viewcontroller;

import com.project.runcooperative.web.services.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoanstableController {

    @Autowired
    LoanService loanService;

    @RequestMapping(value = "/view/loans", method = RequestMethod.GET)
    public String ShowLoansTablePage(Model model){

        model.addAttribute("loans",loanService.getAlloans());

        return "loanstable";
    }
}

