package com.barun.keycloak.dao;

import com.barun.keycloak.pojo.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerDAO extends CrudRepository<Customer, Long> {

}
