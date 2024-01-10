package com.ojas.react.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ojas.react.model.EmployeeEntity;
@Repository
public interface EmployeeRepository extends MongoRepository<EmployeeEntity, String> {

}
