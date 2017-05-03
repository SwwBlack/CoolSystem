package com.ssh.model.entity;

public class AccountMeg {
       private int id;
       private String password;
       private double maney;
       private Student student;
       //
       
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getManey() {
		return maney;
	}
	public void setManey(double maney) {
		this.maney = maney;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}  
       
}
