package com.java.SpringDataJPAProject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.SpringDataJPAProject.dao.IVaccineRepo;
import com.java.SpringDataJPAProject.model.Vaccine;
@Service
public class VaccineServiceImp implements IVaccineService{
	@Autowired
	private IVaccineRepo repo;
	@Override
	public String registerVaccine(Vaccine vaccineInfo) {
		Vaccine vac = repo.save(vaccineInfo);
		return "Vaccine with id "+vac.getId()+" got registered";
	}

	@Override
	public Iterable<Vaccine> registerMultipleVaccines(Iterable<Vaccine> vaccines) {
		return repo.saveAll(vaccines);
		
	}

	@Override
	public long getNoOfVaccines() {
		return repo.count();
		
	}

	@Override
	public boolean checkAvailability(Integer id) {
		return repo.existsById(id);
		 
	}

	@Override
	public Iterable<Vaccine> getAllVaccinesInfo() {
		Iterable<Vaccine> vaccines = repo.findAll();
		return vaccines;
	}

	@Override
	public Iterable<Vaccine> getSpecificVaccineInfo(Iterable<Integer> ids) {
		Iterable<Vaccine> vaccines = repo.findAllById(ids);
		return vaccines;
	}

	@Override
	public Optional<Vaccine> getVaccineById(Integer id) {
		Optional<Vaccine> vac = repo.findById(id);
		return vac;
	}

	@Override
	public String removeVaccineById(Integer id) {
		Optional<Vaccine> vac = repo.findById(id);
		if(vac.isPresent()) {
		repo.deleteById(id);
		return "Vaccine got deleted";
		}
		return "Vaccine not found";
	}

	@Override
	public String removeVaccineByObj(Vaccine vaccine) {
		Optional<Vaccine> vac = repo.findById(vaccine.getId());
		if(vac.isPresent()) {
			repo.delete(vaccine);
			return "Vaccine got deleted";
			}
			return "Vaccine not found";
	}

	@Override
	public String removeVaccinesByIds(List<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

}
