package com.ssh.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ssh.ServeiceImpl.AccountSetviceImpl;

public class CheckmaneyAction extends ActionSupport{
     private AccountSetviceImpl accountSetviceImpl;
     private String studyNum;
     //
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		double maney = accountSetviceImpl.checkManey(studyNum);
		ActionContext.getContext().put("maney", maney);
		return SUCCESS;
	}
	public AccountSetviceImpl getAccountSetviceImpl() {
		return accountSetviceImpl;
	}
	public void setAccountSetviceImpl(AccountSetviceImpl accountSetviceImpl) {
		this.accountSetviceImpl = accountSetviceImpl;
	}
	public String getStudyNum() {
		return studyNum;
	}
	public void setStudyNum(String studyNum) {
		this.studyNum = studyNum;
	}
     
}
