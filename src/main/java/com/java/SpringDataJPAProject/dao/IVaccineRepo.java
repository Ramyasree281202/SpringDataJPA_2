package com.java.SpringDataJPAProject.dao;

import org.springframework.data.repository.CrudRepository;

import com.java.SpringDataJPAProject.model.Vaccine;

public interface IVaccineRepo extends CrudRepository<Vaccine, Integer> {

}
