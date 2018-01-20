package com.project.runcooperative.web.repositories;

import com.project.runcooperative.web.entities.LoanEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepository extends CrudRepository<LoanEntity,Long> {

}
