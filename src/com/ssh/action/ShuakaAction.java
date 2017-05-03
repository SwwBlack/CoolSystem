package com.ssh.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ssh.ServeiceImpl.AccountSetviceImpl;

public class ShuakaAction extends ActionSupport{
	private String studyNum;
	private double pay;
	private AccountSetviceImpl accountsetviceImpl;
	//
	

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		double i = accountsetviceImpl.shuaka(studyNum, pay);
		ActionContext.getContext().put("nowmoney", i);
		return SUCCESS;
	}


	public String getStudyNum() {
		return studyNum;
	}


	public void setStudyNum(String studyNum) {
		this.studyNum = studyNum;
	}
	public double getPay() {
		return pay;
	}


	public void setPay(double pay) {
		this.pay = pay;
	}


	public AccountSetviceImpl getAccountsetviceImpl() {
		return accountsetviceImpl;
	}


	public void setAccountsetviceImpl(AccountSetviceImpl accountsetviceImpl) {
		this.accountsetviceImpl = accountsetviceImpl;
	}
      
}
