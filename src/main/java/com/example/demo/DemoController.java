package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.reps.DepRepo;
import com.example.demo.reps.EmpRepo;

@RestController
public class DemoController {

    @Autowired
    RPRepository th;

    @Autowired
    LeaveRepository lr;

    @GetMapping("/demo")
    public void abc() {
        HttpHeaders hy = new HttpHeaders();
        hy.add("mummy", "ravalika");
        int i = 0;
        throw new CustomException();
    }

    @GetMapping("/postDemo")
    public ResponseEntity<String> postAbc(@RequestHeader("jkl") String lang) {
        return new ResponseEntity<>(lang, HttpStatus.ACCEPTED);
    }

    @GetMapping("/demo123")
    public String abfc() {
       return "hello world";
    }

    @PostMapping("/demo1")
    public ResponseEntity<SampleEntity> fgh(@RequestBody SampleEntity emp){
        System.out.println("saved successfully");
         return new ResponseEntity(th.save(emp),HttpStatus.CREATED);
    }

    @PostMapping("/demo34")
    public ResponseEntity<Leaves> leave(@RequestBody Leaves li){
        return new ResponseEntity<Leaves>(lr.save(li),HttpStatus.CREATED);
    }

    @Autowired
    DepRepo repdep;

    @PostMapping("/demo45")
    public ResponseEntity<Department> depo(@RequestBody Department dep){
        return new ResponseEntity<>(repdep.save(dep),HttpStatus.CREATED);
    }

    @Autowired
    EmpRepo empRepo;

    public ResponseEntity<Employee> empo(@RequestBody Employee emp){
        return new ResponseEntity<>(empRepo.save(emp),HttpStatus.CREATED);
    }

}
