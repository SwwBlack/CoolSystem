package com.ssh.model.daoImpl;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.ssh.model.dao.StudentDao;
import com.ssh.model.entity.Student;

public class StudentDaoImpl extends HibernateDaoSupport implements StudentDao {	
	//
    private org.hibernate.Session getSession(){
    	return super.currentSession();
    }
	@Override
	public void delStudent(String studentNum, String password) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int registerStudent(String studentNum, String name) {
		// TODO Auto-generated method stub
		Session session = getSession();
        String sql = "insert into student(NAME,STUDENTNUM) values('"+name+"','"+studentNum+"')";
        int i = session.createSQLQuery(sql).executeUpdate();
        return i;
	}
	@Override
	public Student findStudent(String studentNum) {
		// TODO Auto-generated method stub
		Session session = getSession();
		String sql = "select * from student where STUDENTNUM=?";
		Query<Student> query = session.createQuery(sql);
		query.setString(0, studentNum);
		return query.getSingleResult();
		
	}
   
}
