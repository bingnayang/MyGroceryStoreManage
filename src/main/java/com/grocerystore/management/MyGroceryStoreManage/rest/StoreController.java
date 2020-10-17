package com.grocerystore.management.MyGroceryStoreManage.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoreController {
	
	@GetMapping("/")
	public String homePage() {
		return "Hello Welcome to My Grocery Store";
	}
	
}
