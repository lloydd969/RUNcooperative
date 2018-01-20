package com.project.runcooperative.web.services.defaultinterface;

import com.project.runcooperative.web.entities.LoanEntity;

import java.util.List;

public interface LoanServiceInt {

    public void save(LoanEntity loanEntity);

    public LoanEntity findById(Long id);

    public boolean isEligibleForLoan(Long dateJoined);

    public List<LoanEntity> getAlloans();
}
