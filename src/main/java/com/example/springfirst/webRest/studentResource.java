package com.example.springfirst.webRest;


import com.example.springfirst.model.student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class studentResource {

    @GetMapping("/students")
    public ResponseEntity getAll(){
        student std = new student(15L,"Abbos","To'lqinov","4");
        student std1 = new student(15L,"Aziz","Mirtojiyev","4");
        student std2 = new student(15L,"Abror","To'lqinov","3");

        List<student>studentList= new ArrayList<>();
        studentList.add(std);
        studentList.add(std1);
        studentList.add(std2);

        return ResponseEntity.ok(studentList);
    }
    @GetMapping("/students/{id}")
    public ResponseEntity getOne(){
        student std = new student(15L,"Abbos","To'lqinov","4");
        return ResponseEntity.ok(std);
    }
    @DeleteMapping("/students/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        return ResponseEntity.ok("Information deleted");

    }




   /* @RequestMapping(value = "/students", method = RequestMethod.GET)
    public String hello(){
        return "hello world";
    }*/

}
