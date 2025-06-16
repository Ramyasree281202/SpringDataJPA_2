package com.java.SpringDataJPAProject.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListPagingAndSortingRepository;

import com.java.SpringDataJPAProject.model.Vaccine;

public interface IVaccineRepo extends ListPagingAndSortingRepository<Vaccine,Integer> {

}
