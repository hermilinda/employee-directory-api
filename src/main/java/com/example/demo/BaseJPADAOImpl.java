package com.example.demo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;



public class BaseJPADAOImpl implements IBaseJPADAO {

	@PersistenceContext(unitName = "persistenceUnit")
	private EntityManager entityManager;
	
	@Override 
	public <T extends JPAEntity> T create(T entity) {

		entityManager.persist(entity);
		return entity;
	}
}
