package com.ssh.model.dao;

import com.ssh.model.entity.Student;

public interface StudentDao {
	//删除学生记录；
    public void delStudent(String studentNum,String password);
    //
    //添加纪录；
    public int registerStudent(String studentNum,String name);
    //
    public Student findStudent(String studentNum);
}
