/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.web.repository;

import com.cibt.web.entity.Student;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ideapad-520S
 */
@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
    @Query(nativeQuery = true,value = "select * from students where status=1")
    List<Student> getSelectedStudents();
}
