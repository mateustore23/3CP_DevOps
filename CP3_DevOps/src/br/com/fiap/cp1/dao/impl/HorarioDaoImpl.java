package br.com.fiap.cp1.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.cp1.dao.HorarioDao;
import br.com.fiap.cp1.entity.Horario;

public class HorarioDaoImpl extends GenericDaoImpl<Horario, Integer> implements HorarioDao{

	public HorarioDaoImpl (EntityManager em) {
		super(em);
	}
}
