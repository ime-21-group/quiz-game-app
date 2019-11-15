package com.gplenty.quiz.daos;

import java.util.List;

import javax.persistence.Query;

import com.gplenty.quiz.domain.User;

@SuppressWarnings("unchecked")
public class UserDao extends AbstractDao<User>
{

	public UserDao() {
		super(User.class);
	}

	public List<User> retrieveByUsername(String username)
	{
		String queryString = "select t from User as t where t.username = :username";
		Query query = em.createQuery(queryString).setParameter("username", username);
		return query.getResultList();
	}
	
	public List<User> retrieveByUsarnameAndPassword(String username, String passwd)
	{
		String queryString = "select t from User as t where t.username = :username and t.passwd = :passwd";
		Query query = em.createQuery(queryString).setParameter("username", username).setParameter("passwd", passwd);
		return query.getResultList();
	}
	
}
