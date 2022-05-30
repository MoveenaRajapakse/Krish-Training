package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class CarController {
	
	@RequestMapping("/cars")
	public List <Car> getAllCars() {
		
		return Arrays.asList(
				
				new Car("c001", "Toyota Prius", "Black"),
				new Car("c002", "Toyota Corolla", "White")
				
				);
		
	}

}
