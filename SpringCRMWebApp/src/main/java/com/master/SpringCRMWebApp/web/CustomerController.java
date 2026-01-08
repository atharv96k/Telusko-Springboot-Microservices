package com.master.SpringCRMWebApp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.master.SpringCRMWebApp.model.Customer;
import com.master.SpringCRMWebApp.service.ICustomerService;

@Controller
public class CustomerController {

	@Autowired
	private ICustomerService service;
	
	@GetMapping("/cxinfo")
	public String getAllCxData(Model model)
	{
		List<Customer> clist = service.getCustomerInfo();
		model.addAttribute("customer", clist);
		clist.forEach(x->System.out.println(x));
		return "customerinfo";
	}
	
	@GetMapping("/showForm")
	public String getForm()
	{
		return "showform";
	}
	
	@PostMapping("/registerCustomer")
	public String registerCustomer(@ModelAttribute("customer")Customer customer,Model model)
	{
		service.registerCustomer(customer);
		return "redirect:/cxinfo";
	}
	
	@GetMapping("/updateForm")
	public String updatecx(@RequestParam("id")Integer id,Model model)
	{
		Customer cx=service.fetchCustomerbyID(id);
		model.addAttribute("customer", cx);
		return "updateform";
	}
	
	@GetMapping("/deletecx")
	public String deletecx(@RequestParam("id")Integer id)
	{
		service.deleteByID(id);
		return "redirect:/cxinfo";
	}
}
