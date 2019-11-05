package com.gplenty.quiz.domain;

import java.util.List;

import javax.persistence.Query;

import com.gplenty.quiz.daos.AbstractDao;

public class QuizDao extends AbstractDao<Quiz> 
{

	public QuizDao() {
		super(Quiz.class);
	}
	
	public List<Quiz> retrieveByQuizName(String name)
	{
		String queryString = "select t from Quiz as t where t.quizName = :name";
		Query query = em.createQuery(queryString).setParameter("name", name);
		return query.getResultList();
	}

}
