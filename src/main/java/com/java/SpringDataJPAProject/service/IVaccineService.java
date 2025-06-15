package com.java.SpringDataJPAProject.service;

import java.util.List;
import java.util.Optional;

import com.java.SpringDataJPAProject.model.Vaccine;

public interface IVaccineService {
	public String registerVaccine(Vaccine vaccineInfo);
	public Iterable<Vaccine> registerMultipleVaccines(Iterable<Vaccine> vaccines);
	public long getNoOfVaccines();
	public boolean checkAvailability(Integer id);
	public Iterable<Vaccine> getAllVaccinesInfo();
	public Iterable<Vaccine> getSpecificVaccineInfo(Iterable<Integer> ids);
	public Optional<Vaccine> getVaccineById(Integer id);
	public String removeVaccineById(Integer id);
	public String removeVaccineByObj(Vaccine vaccine);
	public String removeVaccinesByIds(List<Integer> ids);
}
