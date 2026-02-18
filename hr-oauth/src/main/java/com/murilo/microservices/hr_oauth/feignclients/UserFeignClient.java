package com.murilo.microservices.hr_oauth.feignclients;

import org.springframework.stereotype.Component;
import org.springframework.cloud.openfeign.FeignClient;

@Component
@FeignClient(name = "hr-user", path = "/users")
public interface UserFeignClient {

}
