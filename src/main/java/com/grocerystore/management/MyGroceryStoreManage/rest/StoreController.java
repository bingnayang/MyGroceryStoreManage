package com.grocerystore.management.MyGroceryStoreManage.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoreController {
	
	@GetMapping("/")
	public String homePage() {
		return "Hello Welcome to My Grocery Store";
	}
	@GetMapping("/schedules")
	public String schedulesList() {
		return "This is a work schedule list";
	}
}
