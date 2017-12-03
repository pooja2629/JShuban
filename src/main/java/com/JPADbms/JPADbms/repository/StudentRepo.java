package com.JPADbms.JPADbms.repository;

import com.JPADbms.JPADbms.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Admin on 16/11/2017.
 */
public interface StudentRepo extends JpaRepository<Student,Integer>
{
    Student findById(Integer id);
    List<Student> findByName(String name);
    List<Student> findByCity(String city);
    List<Student> findByIdAndName(Integer id,String name);
}
