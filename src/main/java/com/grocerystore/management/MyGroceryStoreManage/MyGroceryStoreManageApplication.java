package com.grocerystore.management.MyGroceryStoreManage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class MyGroceryStoreManageApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyGroceryStoreManageApplication.class, args);
	}

}
