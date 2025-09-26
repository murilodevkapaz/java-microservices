package com.murilo.microservices.hr_payroll.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.murilo.microservices.hr_payroll.entities.Payment;
import com.murilo.microservices.hr_payroll.services.PaymentService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping(value = "/payments")
public class PaymentResource {

    @Autowired
    private PaymentService service;

    @CircuitBreaker(name = "paymentService", fallbackMethod = "getPaymentFallback")
    @GetMapping(value = "/{workerId}/days/{days}")
    public ResponseEntity<Payment> getPayment(@PathVariable Long workerId, @PathVariable Integer days) {
        Payment payment = service.getPayment(workerId, days);
        return ResponseEntity.ok(payment);
    }

    public ResponseEntity<Payment> getPaymentFallback(Long workerId, Integer days, Exception e) {
        // what I want to implement in case of fallback
        Payment payment = new Payment("Fallback", 0.0, days);
        return ResponseEntity.ok(payment);
    }

}
