package br.com.fiap.cp1.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.cp1.dao.FilmeDao;
import br.com.fiap.cp1.entity.Filme;

public class FilmeDaoImpl extends GenericDaoImpl<Filme, Integer> implements FilmeDao{
	
	public FilmeDaoImpl (EntityManager em) {
		super(em);
	}
	
}
