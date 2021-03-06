package com.boot.crud;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.crud.entity.EmployeeEntity;

@SpringBootApplication
@RestController
public class BootCrudPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootCrudPocApplication.class, args);
	}
	@GetMapping("/employees")
	 public List<EmployeeEntity>  getEmployees() {
		List<EmployeeEntity> emplist = new ArrayList<>();
		
		return emplist; 
	 }
	

}