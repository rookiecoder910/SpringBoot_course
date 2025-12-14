package com.codingshuttle.youtube.internalWorkingOfSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component  //marks a class as a Spring bean so that it can be
            // detected during component scanning
            // and registered in the IoC container or application context.
@ConditionalOnProperty(name = "payment.provider",havingValue = "razorpay")
public class RazorPayPaymentService implements PaymentService {
    public String pay(){
        String payment="Razorpay ";
        System.out.println("Payment from :"+payment);
        return payment;

    }
}
