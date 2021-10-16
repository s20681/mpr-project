package com.pjatk.carcreator;

import com.pjatk.carcreator.model.Car;
import com.pjatk.carcreator.model.Color;
import com.pjatk.carcreator.model.Customer;
import com.pjatk.carcreator.model.Upgrade;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class CarCreatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarCreatorApplication.class, args);

		Customer customer = new Customer("John", "Smiths");
		Upgrade upgrade1 = new Upgrade("Cabrio", 1000);
		Upgrade upgrade2 = new Upgrade("Premium interior", 5000);
		Car car = new Car(10000, customer);
		car.setColorEnum(Color.BLACK);
		car.addUpgrade(upgrade1);
		car.addUpgrade(upgrade2);
		car.setDeliveryDate(LocalDate.now());

		System.out.println(car);

	}

}
