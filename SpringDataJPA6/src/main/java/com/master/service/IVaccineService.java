package com.master.service;

import java.util.List;
 
import com.master.view.View;

public interface IVaccineService {
	
	public<T extends View>List<T> fetchByCost(Double cost,Class<T> cls);
	
	
}
