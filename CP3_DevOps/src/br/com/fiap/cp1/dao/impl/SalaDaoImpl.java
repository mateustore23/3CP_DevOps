package br.com.fiap.cp1.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.cp1.dao.SalaDao;
import br.com.fiap.cp1.entity.Sala;

public class SalaDaoImpl extends GenericDaoImpl<Sala, Integer> implements SalaDao{

	public SalaDaoImpl (EntityManager em) {
		super(em);
	}
	
}
