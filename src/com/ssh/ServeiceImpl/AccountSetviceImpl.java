package com.ssh.ServeiceImpl;

import com.ssh.model.dao.AccountDao;

public class AccountSetviceImpl {
    private AccountDao accountDao;

	public AccountDao getAccountDao() {
		return accountDao;
	}

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	//��ѯ���
	public double checkManey(String studentnum){
		return accountDao.findManny(studentnum);
	}
	//ˢ���Ͳ�
	public double shuaka(String studentnum,double x){
		return accountDao.shuaka(studentnum, x);
	}
	
	
}
