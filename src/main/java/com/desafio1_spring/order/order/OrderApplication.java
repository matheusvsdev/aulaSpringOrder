package com.desafio1_spring.order.order;

import com.desafio1_spring.order.order.entities.Order;
import com.desafio1_spring.order.order.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderApplication implements CommandLineRunner {

	@Autowired
	public OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Order order1 = new Order(1034, 150.00, 20.00);
		Order order2 = new Order(2282, 800.00, 10.00);
		Order order3 = new Order(1309, 95.90, 0.00);

		System.out.printf("Pedido código: %d\nValor total: R$ %.2f\n", order1.getCode(), orderService.total(order1));
		System.out.println();
		System.out.printf("Pedido código: %d\nValor total: R$ %.2f\n", order2.getCode(), orderService.total(order2));
		System.out.println();
		System.out.printf("Pedido código: %d\nValor total: R$ %.2f\n", order3.getCode(), orderService.total(order3));
	}
}
