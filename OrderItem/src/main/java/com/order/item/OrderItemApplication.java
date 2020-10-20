package com.order.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.order.item.*"})
@EntityScan({"com.order.item.entity"})
public class OrderItemApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderItemApplication.class, args);
	}

}
