package com.ssh.model.daoImpl;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.ssh.model.dao.AccountDao;

public class AccountDaoImpl extends HibernateDaoSupport implements AccountDao{
    //
	private Session getSession(){
		return super.currentSession();
	}
	@Override
	public double findManny(String studentnum) {
		// TODO Auto-generated method stub
		Session session = getSession();
		String sql = "select MANEY from accountmeg,student where accountmeg.student_id=student.id and student.studentNum='"+studentnum+"'";
		SQLQuery query = session.createSQLQuery(sql);
		double results = (double) query.uniqueResult();
		return results;
		
	}

	@Override
	public  double  shuaka(String studentnum, double x) {
		// TODO Auto-generated method stub
		double primaryMoney = findManny(studentnum);
		double nowMoney = primaryMoney-x;
		Session session = getSession();
		String sql = "update accountmeg,student set maney='"+nowMoney+"' where accountmeg.student_id=student.id and student.studentNum='"+studentnum+"'";
		SQLQuery query = session.createSQLQuery(sql);
		query.executeUpdate();
		return nowMoney;
	}

}
