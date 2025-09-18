package com.murilo.microservices.hrworker.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.murilo.microservices.hrworker.repositories.IWorkerRepository;
import java.util.List;
import org.springframework.http.ResponseEntity;
import com.murilo.microservices.hrworker.entities.Worker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {

    @Autowired
    private IWorkerRepository repository;

    @GetMapping
    public ResponseEntity<List<Worker>> findAll() {
        List<Worker> list = repository.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value= "/{id}")
    public ResponseEntity<Worker> findById(@PathVariable Long id) {
        Worker worker = repository.findById(id).orElse(null);
        return ResponseEntity.ok(worker);
    }
}
