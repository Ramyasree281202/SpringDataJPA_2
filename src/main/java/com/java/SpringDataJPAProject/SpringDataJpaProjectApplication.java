package com.java.SpringDataJPAProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.java.SpringDataJPAProject.dao.IVaccineRepo;

import com.java.SpringDataJPAProject.model.Vaccine;
import com.java.SpringDataJPAProject.service.VaccineServiceImp;

@SpringBootApplication
public class SpringDataJpaProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpaProjectApplication.class, args);
		VaccineServiceImp service = container.getBean(VaccineServiceImp.class);
//		Vaccine vaccine = new Vaccine("covidsheild","America",1000);
//		service.registerVaccine(vaccine);
		
//		Vaccine vac1 = new Vaccine("Pencilin","Russia",2000);
//		Vaccine vac2 = new Vaccine("Injection","USA",9000);
//		Vaccine vac3 = new Vaccine("OverianCancer","India",800);
//		
//		List<Vaccine> list = new ArrayList<>();
//		list.add(vac1);
//		list.add(vac2);
//		list.add(vac3);
//		service.registerMultipleVaccines(list).forEach((v)->System.out.println(v));
		
//		long count = service.getNoOfVaccines();
//		System.out.println(count);
		
//		if(service.checkAvailability(2)) {
//			System.out.println("Yes Vaccine is available");
//		}
//		else {
//			System.out.println("No Vaccine is available");
//		}
		
//		Iterable<Vaccine> vaccines = service.getAllVaccinesInfo();
//		vaccines.forEach((v)->System.out.println(v));
		
//		List<Integer> list = new ArrayList<>();
//		list.add(2);
//		list.add(7);
//		list.add(1);
//		Iterable<Vaccine> vaccines = service.getSpecificVaccineInfo(list);
//		vaccines.forEach((v)->System.out.println(v));
//		Optional<Vaccine> vac = service.getVaccineById(10);
//		if(vac.isPresent()) {
//			System.out.println(vac);
//		}
//		else
//			vac.orElseThrow(()-> new IllegalArgumentException("Vaccine not found"));
//		System.out.println(service.removeVaccineById(2));
		
		Vaccine vaccine = new Vaccine("India","OverianCancer",800); 
		vaccine.setId(4);
		System.out.println(service.removeVaccineByObj(vaccine));
	} 
		

}
