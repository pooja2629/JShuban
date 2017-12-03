package com.JPADbms.JPADbms.controller;

import com.JPADbms.JPADbms.model.Student;
import com.JPADbms.JPADbms.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Admin on 16/11/2017.
 */
@RestController
public class StudentController {

    @Autowired
    StudentRepo studentRepo;

    @PostMapping(value = "/saveData")
    public String saveData(@RequestBody Student student)
    {
        studentRepo.save(student);
        return  "Record inserted successfully";
    }

    @GetMapping(value = "/showAllData")
    public List<Student> showAllData()
    {
        List<Student> list =studentRepo.findAll();
        return list;
    }

    @GetMapping(value = "/getById/{id}")
    public Student getById(@PathVariable Integer id)
    {
        return studentRepo.findById(id);
    }

    @GetMapping(value = "/getByName/{name}")
    public List<Student> getByName(@PathVariable String name)
    {
        List<Student> list =  studentRepo.findByName(name);
        return list;
    }
    @GetMapping(value = "/getByCity/{city}")
    public List<Student> getByCity(@PathVariable String city)
    {
        List<Student> list = studentRepo.findByCity(city);
        return  list;
    }
    @GetMapping(value = "/getByIdAndName")
    public List<Student> getByIdAndName(@PathVariable Integer id,String name)
    {
        List<Student> list = studentRepo.findByIdAndName(id,name);
        return  list;
    }

}
