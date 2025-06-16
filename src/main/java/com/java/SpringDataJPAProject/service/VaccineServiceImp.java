package com.java.SpringDataJPAProject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.java.SpringDataJPAProject.dao.IVaccineRepo;
import com.java.SpringDataJPAProject.model.Vaccine;
@Service
public class VaccineServiceImp implements IVaccineService{
	@Autowired
	private IVaccineRepo repo;

	@Override
	public void fetchDetails(boolean status, String... properties) {
		Sort sort = Sort.by(status? Direction.ASC:Direction.DESC, properties);
		Iterable<Vaccine> vaccines = repo.findAll(sort);
		vaccines.forEach((v)->System.out.println(v.getVaccineName()));
		
	}

	@Override
	public void fetchDeatils(int pageNo, int pageSize, boolean status, String... properties) {
		Sort sort = Sort.by(status? Direction.ASC:Direction.DESC, properties);
		PageRequest pageable = PageRequest.of(pageNo,pageSize,sort);
		Page<Vaccine> page = repo.findAll(pageable);
		page.getContent().forEach((v)->System.out.println(v));
		
	}

	@Override
	public void fetchDetailsPagination(int pageSize) {

		long count=4L;
		
		long pagesCount=count/pageSize;  //4/2===> 2   // 12/3---> 4
		pagesCount=count%pageSize==0?pagesCount: ++pagesCount;
		
		//14/5--> 3 // 14/5--> 2.8 --> 3.8
		for(int i=0; i<pagesCount; i++)
		{
			PageRequest pageable = PageRequest.of(i, pageSize);
			Page<Vaccine> page = repo.findAll(pageable);
			System.out.println("Page Number : "+ i);
			page.getContent().forEach(c->System.out.println(c.getVaccineName()+ " : "+c.getVaccineCompany()));
			System.out.println("---------------------------------------------");
		}
		
	}
	

	
	
}
