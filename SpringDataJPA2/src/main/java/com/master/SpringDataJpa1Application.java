package com.master;
 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.master.entity.Vaccine;
import com.master.service.VaccineService;

@SpringBootApplication
public class SpringDataJpa1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpa1Application.class, args);
		
		VaccineService service = container.getBean(VaccineService.class);
		
//		Vaccine vac=new Vaccine("Polio","WHO",00.0);
		
//		String status = service.registerVaccineInfo(vac);
		
//		System.out.println(status);
		
		List<Vaccine> vaccinesList = new ArrayList<Vaccine>();
		vaccinesList.add(new Vaccine("CovidShield", "BharatBio", 1999.9));
		vaccinesList.add(new Vaccine("Covaxin", "BharatBio", 1850.0));
		vaccinesList.add(new Vaccine("Sputnik V", "Gamaleya", 2100.5));
		vaccinesList.add(new Vaccine("Pfizer-BioNTech", "Pfizer", 3200.75));
		vaccinesList.add(new Vaccine("Moderna", "Moderna Inc.", 3500.0));
		vaccinesList.add(new Vaccine("AstraZeneca", "AstraZeneca", 2800.0));
		vaccinesList.add(new Vaccine("Sinopharm", "Sinopharm", 1500.0));
		vaccinesList.add(new Vaccine("Sinovac", "Sinovac Biotech", 1450.5));
		vaccinesList.add(new Vaccine("Johnson & Johnson", "Janssen", 2700.0));
		vaccinesList.add(new Vaccine("Novavax", "Novavax Inc.", 2600.0));
		vaccinesList.add(new Vaccine("ZyCoV-D", "Zydus Cadila", 900.0));
		vaccinesList.add(new Vaccine("Corbevax", "Biological E", 1200.0));
		vaccinesList.add(new Vaccine("Sputnik Light", "Gamaleya", 1950.0));
		vaccinesList.add(new Vaccine("Covovax", "Serum Institute", 1600.0));
		vaccinesList.add(new Vaccine("Spikevax", "Moderna Inc.", 3400.0));
		vaccinesList.add(new Vaccine("Comirnaty", "Pfizer", 3300.0));
		vaccinesList.add(new Vaccine("Abdala", "BioCubaFarma", 1100.0));
		vaccinesList.add(new Vaccine("Soberana 02", "Finlay Institute", 1050.0));
		vaccinesList.add(new Vaccine("QazVac", "QazCovid-in", 1300.0));
		vaccinesList.add(new Vaccine("EpiVacCorona", "Vector Institute", 1400.0));

		service.registerMultipleVaccineInfo(vaccinesList);
		service.getAllVaccineInfo().forEach(c->System.out.println(c));
//		System.out.println(service.vaccineCount());
		
//		List<Integer> ids = Arrays.asList(3,4);
//		service.getAllVaccines(ids).forEach(v->System.out.println(v));
		
//		Integer id=3;
//		String status= service.removeVaccineById(id); 
//		System.out.println(status);
		
//		List<Integer> ids = Arrays.asList(1,2,6,3, 4, 5);
//		service.getAllVaccines(ids).forEach(v->System.out.println(v));
//		String status =service.removeAllVaccines(ids);
//		System.out.println(status);
//		
	}

}
