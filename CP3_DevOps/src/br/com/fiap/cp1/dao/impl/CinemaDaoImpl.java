package br.com.fiap.cp1.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.cp1.dao.CinemaDao;
import br.com.fiap.cp1.entity.Cinema;

public class CinemaDaoImpl extends GenericDaoImpl <Cinema, Integer> implements CinemaDao {

	public CinemaDaoImpl (EntityManager em) {
		super(em);
	}
}
