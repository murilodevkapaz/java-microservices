package com.murilo.microservices.hr_payroll.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.murilo.microservices.hr_payroll.entities.Payment;
import com.murilo.microservices.hr_payroll.entities.Worker;
import com.murilo.microservices.hr_payroll.feignclients.IWorkerFeignClients;

@Service
public class PaymentService {

    @Autowired
    private IWorkerFeignClients workerFeignClients;

    public Payment getPayment(long workerId, int days) {

        Worker worker = workerFeignClients.findById(workerId).getBody();

        double dailyIncome = worker.getDailyIncome();
        return new Payment(worker.getName(), dailyIncome, days);
    }
}
