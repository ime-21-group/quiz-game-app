package com.gplenty.quiz.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public abstract class AbstractDao<Type> 
{

	private EntityManagerFactory emf;
	private EntityManager em;
	private Class<Type> typeClass;
	
	public AbstractDao(Class<Type> typeClass)
	{
		Type t;
		emf = Persistence.createEntityManagerFactory("QuizPersistence");
		em = emf.createEntityManager();
		this.typeClass = typeClass;
	}
	
	public List<Type> retrieveAll()
	{
		String queryString = "Select t from " + typeClass.getSimpleName() + " t";
		Query query = em.createQuery(queryString);
		return query.getResultList();
	}
	
	public void save(Type element)
	{
		em.persist(element);
		em.getTransaction().begin();
		em.getTransaction().commit();
	}
	
}
