package com.codingshuttle.youtube.internalWorkingOfSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //entry point of springboot application
public class InternalWorkingOfSpringBootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(InternalWorkingOfSpringBootApplication.class, args);
	}
    //field injection
//    @Autowired

    private final PaymentService paymentService;
    //constructor injection
 public InternalWorkingOfSpringBootApplication(PaymentService paymentService) {
     this.paymentService=paymentService;
 }
    @Override
    public void run(String... args) throws Exception {
        paymentService.pay();
        String payment=" ";
        System.out.println("payment done from" + payment);

    }
}
