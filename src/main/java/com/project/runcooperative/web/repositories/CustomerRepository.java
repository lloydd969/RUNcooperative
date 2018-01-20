package com.project.runcooperative.web.repositories;

import com.project.runcooperative.web.entities.CustomerEntity;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<CustomerEntity,Long> {

    //CustomerEntity getCustomerEntityByEmailAddress(String email);

}
