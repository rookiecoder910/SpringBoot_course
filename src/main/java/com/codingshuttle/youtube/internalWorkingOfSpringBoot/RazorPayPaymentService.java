package com.codingshuttle.youtube.internalWorkingOfSpringBoot;

import org.springframework.stereotype.Component;

@Component  //marks a class as a Spring bean so that it can be
            // detected during component scanning
            // and registered in the IoC container or application context.
public class RazorPayPaymentService {
    public String pay(){
        String payment="Razorpay ";
        System.out.println("Payment from :"+payment);
        return payment;

    }
}
