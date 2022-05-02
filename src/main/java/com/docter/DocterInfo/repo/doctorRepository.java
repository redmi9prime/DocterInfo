package com.docter.DocterInfo.repo;

import org.springframework.data.repository.CrudRepository;

import com.docter.DocterInfo.entity.doctorPojo;



public interface doctorRepository extends CrudRepository<doctorPojo, Integer> {

}
