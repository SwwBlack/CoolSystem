package com.ssh.action;

import com.opensymphony.xwork2.ActionSupport;
import com.ssh.ServeiceImpl.StudentServiceImpl;

public class StudentAction extends ActionSupport{
	
    private StudentServiceImpl studentserviceimpls;
    private String studyNum;
    private String name;
    
	public String getStudyNum() {
		return studyNum;
	}
	public void setStudyNum(String studyNum) {
		this.studyNum = studyNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
          studentserviceimpls.registerSuccess(studyNum,name);
          return SUCCESS;
	}
	public StudentServiceImpl getStudentserviceimpls() {
		return studentserviceimpls;
	}
	public void setStudentserviceimpls(StudentServiceImpl studentserviceimpls) {
		this.studentserviceimpls = studentserviceimpls;
	}
      
}
