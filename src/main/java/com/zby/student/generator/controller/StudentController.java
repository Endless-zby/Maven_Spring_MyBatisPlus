package com.zby.student.generator.controller;


import com.zby.student.generator.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jobob
 * @since 2019-05-14
 */
@RestController
@RequestMapping("/generator")
public class StudentController {

    @Autowired
    private StudentServiceImpl studentService;

    @GetMapping("query")
    public void queryById(@PathVariable("id") int id){
        studentService.queryById(id);
    }
}

