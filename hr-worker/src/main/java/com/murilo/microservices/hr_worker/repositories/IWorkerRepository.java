package com.murilo.microservices.hr_worker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.murilo.microservices.hr_worker.entities.Worker;

public interface IWorkerRepository extends JpaRepository<Worker, Long> {

}
