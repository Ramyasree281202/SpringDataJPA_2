package com.java.SpringDataJPAProject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;

import com.java.SpringDataJPAProject.model.Vaccine;

public interface IVaccineService {
	public void fetchDetails(boolean status,String... properties);
	public void fetchDeatils(int pageNo,int pageSize,boolean status, String... properties);
	public void fetchDetailsPagination(int pageSize);
}
