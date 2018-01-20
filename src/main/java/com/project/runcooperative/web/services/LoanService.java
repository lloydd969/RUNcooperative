package com.project.runcooperative.web.services;

import com.project.runcooperative.web.entities.LoanEntity;
import com.project.runcooperative.web.repositories.LoanRepository;
import com.project.runcooperative.web.services.defaultinterface.LoanServiceInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class LoanService implements LoanServiceInt {

    @Autowired
    LoanRepository loanRepository;

    @Override
    public void save(LoanEntity loanEntity) {

        loanRepository.save(loanEntity);
    }

    @Override
    public LoanEntity findById(Long id) {

       return loanRepository.findOne(id);

    }

    @Override
    public boolean isEligibleForLoan(Long dateJoined) {

        Long milliseconds = new Date().getTime() - dateJoined;

        long days = (milliseconds / (60*60*24*1000));

        if(days >= 180){

            return  true;
        }
        else{

            return false;
        }
    }

    @Override
    public List<LoanEntity> getAlloans() {

        return (List<LoanEntity>) loanRepository.findAll();

    }
}
