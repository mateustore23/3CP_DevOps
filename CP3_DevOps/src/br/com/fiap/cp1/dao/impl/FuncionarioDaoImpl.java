package br.com.fiap.cp1.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.cp1.dao.FuncionarioDao;
import br.com.fiap.cp1.entity.Funcionario;

public class FuncionarioDaoImpl extends GenericDaoImpl <Funcionario, Integer> implements FuncionarioDao{

	public FuncionarioDaoImpl (EntityManager em) {
	super(em);
	}
}
