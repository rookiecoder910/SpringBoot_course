package com.codingshuttle.youtube.internalWorkingOfSpringBoot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InternalWorkingOfSpringBootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(InternalWorkingOfSpringBootApplication.class, args);
	}
    private RazorPayPaymentService paymentService;
 public InternalWorkingOfSpringBootApplication(RazorPayPaymentService paymentService) {
     this.paymentService=paymentService;
 }
    @Override
    public void run(String... args) throws Exception {
        paymentService.pay();
        String payment=" Razorpay ";
        System.out.println("payment done from" + payment);

    }
}
