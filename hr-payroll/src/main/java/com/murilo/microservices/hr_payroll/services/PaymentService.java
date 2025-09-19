package com.murilo.microservices.hr_payroll.services;

import org.springframework.stereotype.Service;

import com.murilo.microservices.hr_payroll.entities.Payment;

@Service
public class PaymentService {
    public Payment getPayment(long workerId, int days) {
        Double dailyIncome = 200.0;
        return new Payment("Bob", dailyIncome, days);
    }
}
