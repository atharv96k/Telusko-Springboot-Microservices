package com.master.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BooksController {

	@GetMapping("/home")
	public String getSomeInfo( ) {
		return "home";
	}

	@GetMapping("/responce")
	public String getBooksInfo(Map<String, Object> map) {
		String books[] = new String[] {"Spring", " SpringBoot"," Spring MVC"," Microservices"};
		for (String booksName : books) {
			System.out.println(booksName);
		}
		map.put("books", books);
		return "responce";
	}

}

