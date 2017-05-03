package com.ssh.ServeiceImpl;

import org.hibernate.boot.model.source.spi.PluralAttributeElementSourceBasic;

import com.ssh.Service.StudentService;
import com.ssh.model.dao.StudentDao;

public class StudentServiceImpl implements StudentService {
	//
    private StudentDao studentDao;
    //getterºÍseter·½·¨
	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	//
	public int registerSuccess(String studentnum,String name){
		return studentDao.registerStudent(studentnum,name);
	}
}
