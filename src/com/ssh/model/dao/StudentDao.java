package com.ssh.model.dao;

import com.ssh.model.entity.Student;

public interface StudentDao {
	//ɾ��ѧ����¼��
    public void delStudent(String studentNum,String password);
    //
    //��Ӽ�¼��
    public int registerStudent(String studentNum,String name);
    //
    public Student findStudent(String studentNum);
}
