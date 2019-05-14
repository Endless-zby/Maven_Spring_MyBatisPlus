package com.zby.student.generator.service.impl;

import com.zby.student.generator.entity.Student;
import com.zby.student.generator.mapper.StudentMapper;
import com.zby.student.generator.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-05-14
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

    private StudentMapper studentMapper;


    @Override
    public Student queryById(int id) {
        return studentMapper.selectById(id);
    }
}
