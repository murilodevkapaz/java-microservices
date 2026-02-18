package com.murilo.microservices.hr_oauth.feignclients;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.murilo.microservices.hr_oauth.entities.User;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;

@Component
@FeignClient(name = "hr-user", path = "/users")
public interface UserFeignClient {

    
    @GetMapping(value = "/search")
    ResponseEntity<User> findByEmail(@RequestParam String email);
}
