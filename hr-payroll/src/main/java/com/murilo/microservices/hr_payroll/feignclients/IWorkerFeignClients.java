package com.murilo.microservices.hr_payroll.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.murilo.microservices.hr_payroll.entities.Worker;

@Component // this is a componente managed by Spring
@FeignClient(name = "hr-worker", path = "/workers") // name of the service to communicate with
public interface IWorkerFeignClients {

    @GetMapping(value = "/{id}")
    ResponseEntity<Worker> findById(@PathVariable Long id);
}
