package com.zby.student.generator.service;

import com.zby.student.generator.entity.Student;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jobob
 * @since 2019-05-14
 */
public interface IStudentService extends IService<Student> {

    public Student queryById(int id);

}
