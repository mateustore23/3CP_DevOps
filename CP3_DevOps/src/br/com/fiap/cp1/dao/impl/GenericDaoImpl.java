package br.com.fiap.cp1.dao.impl;

import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;

import br.com.fiap.cp1.dao.GenericDao;
import br.com.fiap.cp1.exception.CommitException;
import br.com.fiap.cp1.exception.EntityNotFoundException;

public class GenericDaoImpl <E,K> implements GenericDao <E,K>{

	private EntityManager em;
	
	private Class<E> clazz;
	
	@SuppressWarnings("unchecked")
	public GenericDaoImpl(EntityManager em) {
		this.em = em;
		this.clazz = (Class<E>) ( (ParameterizedType) 
				getClass().getGenericSuperclass())
						.getActualTypeArguments()[0];
	}
	
	@Override
	public void insert(E entidade) {
		em.persist(entidade);	
	}

	@Override
	public E select(K id) throws EntityNotFoundException {
		E entidade = em.find(clazz, id);
		if (entidade == null)
			throw new EntityNotFoundException();
		return entidade;
	}

	@Override
	public void delete(K id) throws EntityNotFoundException {
		E entidade = select(id);
		em.remove(entidade);
	}

	@Override
	public void update(E entidade) {
		em.merge(entidade);
	}

	@Override
	public void commit() throws CommitException {
		try {
			em.getTransaction().begin();
			em.getTransaction().commit();
		}catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
			throw new CommitException();
		}
	}
	
}
