package br.com.fiap.cp1.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.cp1.dao.SalaFilmeDao;
import br.com.fiap.cp1.entity.SalaFilme;

public class SalaFilmeDaoImpl extends GenericDaoImpl <SalaFilme, Integer> implements SalaFilmeDao{

	public SalaFilmeDaoImpl (EntityManager em) {
		super(em);
	}
	
}
