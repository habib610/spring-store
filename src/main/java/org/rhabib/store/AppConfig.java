package org.rhabib.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Value("${app.payment.name}")
    private String payment;

    @Bean
    public PaymentService stripe(){
        return new StripePaymentService();
    }

    @Bean
    public PaymentService paypal(){
        return new PaypalPaymentService();
    }

    @Bean
    public OrderService orderService() {
        if(payment.equals("stripe")) {
                 return new OrderService(stripe());
        }
        return new OrderService(paypal());
    }
}
