package com.master.SpringDataJPA1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.master.SpringDataJPA1.enitity.Master;
import com.master.SpringDataJPA1.repo.IMasterRepo;

@Component
public class DataJPARunner implements CommandLineRunner {

	@Autowired
	private IMasterRepo repo;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(repo.getClass().getName());
			repo.save(new Master(2,"Shruti","Chennai"));
	}

}
