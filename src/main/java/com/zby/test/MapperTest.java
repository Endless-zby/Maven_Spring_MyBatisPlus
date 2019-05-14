package com.zby.test;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.zby.entity.Student;
import com.zby.mapper.StudentMapper;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.Serializable;
import java.util.List;

public class MapperTest implements Serializable {

    private static ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    private static StudentMapper studentMapper = applicationContext.getBean("studentMapper", StudentMapper.class);

    public static void testInsert(){
        Student student = new Student("赵博雅",22);
        int insert = studentMapper.insert(student);
        System.out.println(insert);
        System.out.println(student);
    }

    public static void testPageQuery(){

        QueryWrapper<Student> wrapper = new QueryWrapper<>();
        wrapper.eq("stu_age",22);

        List<Student> students = studentMapper.selectList(wrapper);
        System.out.println(students);
    }

    public static void testAR(){
        new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = new Student();
        List list = student.selectList(new QueryWrapper<Student>().lambda().eq(Student::getStuNo, 1));
        System.out.println(list);

    }


    public static void main(String[] args) {
//        testInsert();
//        testPageQuery();
        testAR();
    }


}
