package com.master.RestApiApp1.rest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatcher;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.assertj.MockMvcTester.MockMvcRequestBuilder;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.master.RestApiApp1.model.Student;
import com.master.RestApiApp1.service.IGreetings;

@WebMvcTest(GreetingsController.class)
class GreetingsControllerTest {

	@MockBean
	private IGreetings service;
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	@Disabled
	void testGreetingsController() throws Exception {
		//Mocking
		Mockito.when(service.generateWish("Mahesh")).thenReturn("Good Morning!");
		
		//Request Object
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/restapi/greet");
		ResultActions result = mockMvc.perform(requestBuilder);
		MvcResult mvcResult = result.andReturn();
		
		MockHttpServletResponse response = mvcResult.getResponse();
		int statusCode = response.getStatus();
		
		
		//Assertion
		assertEquals(200, statusCode);
	}

	
	@Test
	void testAddStudent() throws Exception{
		//Mocking  
		Mockito
		.when(service.addStudent(ArgumentMatchers.any()))
		.thenReturn(true);
		
		
		Student student = new Student(45,"Mayur","Jejuri");
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(student);
		
		//RequestBuilder 
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/restapi/add")
				.contentType(MediaType.APPLICATION_JSON)
				.content(json);ResultActions result = mockMvc.perform(requestBuilder);
				MvcResult mvcResult = result.andReturn();
				
				MockHttpServletResponse response = mvcResult.getResponse();
				int statusCode = response.getStatus();
				
				
				//Assertion
				assertEquals(200, statusCode);
		
		
	}
}
