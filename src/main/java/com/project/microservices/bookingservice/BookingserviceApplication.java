package com.project.microservices.bookingservice;

import com.bookmyshow.common.library.proxy.SearchServiceProxy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableFeignClients(basePackages = "com.bookmyshow.common.library.proxy")
@EnableJpaRepositories(basePackages = "com.bookmyshow.common.library.repository")
@EntityScan(basePackages = "com.bookmyshow.common.library.entity")
@ComponentScan(basePackages = {
		"com.project.microservices.bookingservice",
		"com.bookmyshow.common.library"
})
public class BookingserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingserviceApplication.class, args);
	}

}
