package com.project.runcooperative.web.controllers.restcontroller;

import com.project.runcooperative.web.entities.*;
import com.project.runcooperative.web.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Test {

    @Autowired
    PersonnelService personnelService;

    @Autowired
    CustomerService customerService;

    @Autowired
    PriviledgeService priviledgeService;

    @Autowired
    AccountNumberService accountNumberService;

    @Autowired
    LoanTypeService loanTypeService;

    @RequestMapping(value = "/populate", method = RequestMethod.GET)
    public void PopulatePriviledge(Model model) {
        Priviledge p = new Priviledge();
        p.setName("Admin");

        priviledgeService.save(p);

        Priviledge p1 = new Priviledge();
        p1.setName("Teller");

        priviledgeService.save(p1);

        Priviledge p2 = new Priviledge();
        p2.setName("User");

        priviledgeService.save(p2);

        LoanTypeEntity loanTypeEntity = new LoanTypeEntity();
        loanTypeEntity.setInterestRate(10);
        loanTypeEntity.setLoanTypeName("EmergencyLoan");

        loanTypeService.save(loanTypeEntity);

        LoanTypeEntity loanTypeEntity2 = new LoanTypeEntity();
        loanTypeEntity2.setInterestRate(0);
        loanTypeEntity2.setLoanTypeName("Regular Loan");

        loanTypeService.save(loanTypeEntity2);

        CustomerEntity runcooperative = new CustomerEntity();

        List<AccountEntity> accountEntities = new ArrayList<>();

        AccountEntity account = new AccountEntity();
        account.setAmount(100000000);
        account.setAccountholder(runcooperative);
        account.setAccountNumber("0000");

        accountEntities.add(account);

        runcooperative.setPhoneNumber("09053511105");
        runcooperative.setEmailAddress("lloydd969@gmail.com");
        runcooperative.setFirstname("Cooperative");
        runcooperative.setLastname("Account");
        runcooperative.setAccounts(accountEntities);

        PersonnelEntity user = new PersonnelEntity();

        user.setFirstname("Kanyin");
        user.setLastname("Olajide");
        user.setPhoneNumber("09053511105");
        user.setEmailAddress("lloydd969@gmail.com");
        user.setPassword("hihi");
        user.setPriviledge(priviledgeService.getPriviledge(1));
        personnelService.save(user);

        customerService.save(runcooperative);

    }


    @RequestMapping(value="/accountnumber", method = RequestMethod.GET)
    public String CreateAccountNumber(Model model)
    {
        return accountNumberService.generateToken(7);
    }
}
