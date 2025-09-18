package com.murilo.microservices.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.murilo.microservices.hrworker.entities.Worker;

public interface IWorkerRepository extends JpaRepository<Worker, Long> {

}
