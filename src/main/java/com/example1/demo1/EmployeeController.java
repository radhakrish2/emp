package com.example1.demo1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping
public class EmployeeController {
	@GetMapping
	public String getMessage() {
		return new String("Welcome to Spring");
	}
}
