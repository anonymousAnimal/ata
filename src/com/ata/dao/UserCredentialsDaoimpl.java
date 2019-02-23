package com.ata.dao;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ata.bean.CredentialsBean;

@Repository
public class UserCredentialsDaoimpl implements XyzDao<CredentialsBean>
{
	@Autowired
	SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		sessionFactory = sf;
	}
	
	@Override
	public String create(CredentialsBean t) {
		// this return the userid from credentials
		String id = (String)sessionFactory.getCurrentSession().save(t);
		return id;
	}

	@Override
	public int delete(ArrayList<String> list) {
		
		String query = "delete from CredentialsBean where userid in :list";
		Query queryobj = sessionFactory.getCurrentSession().createQuery(query);
		queryobj.setParameterList("list", list);
		int rowcnt = queryobj.executeUpdate();
		return rowcnt;
	}

	@Override
	public boolean update(CredentialsBean t) {
		
		try{
		sessionFactory.getCurrentSession().update(t);
		return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception :" + e.getMessage());
			return false;
		}
		
	}

	@Override
	public CredentialsBean findByID(String s) {
		
		CredentialsBean cbean = (CredentialsBean) sessionFactory.getCurrentSession().get(CredentialsBean.class, s);
		
		return cbean;
	}

	@Override
	public ArrayList<CredentialsBean> findAll() 
	{
		ArrayList<CredentialsBean> list = (ArrayList<CredentialsBean>)sessionFactory.getCurrentSession().createCriteria(CredentialsBean.class).list();
		return list;
	}

}
