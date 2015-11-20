package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.database.UserService;

@SpringBootApplication
@RestController
public class SolidarityApplication {

	@Autowired
	private UserService service;

	@RequestMapping("/resource/{id}")
	public ModelAndView home(@PathVariable String id) {
		ModelAndView model = new ModelAndView();

		String userName = service.getById(Integer.parseInt(id));
		model.setViewName(userName);

		// model.put("id", UUID.randomUUID().toString());
		// model.put("content", "Hello World");
		return model;
	  }
	
    public static void main(String[] args) {
        SpringApplication.run(SolidarityApplication.class, args);
    }
}
