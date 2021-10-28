package br.com.fiap.cp1.dao;

import br.com.fiap.cp1.exception.CommitException;
import br.com.fiap.cp1.exception.EntityNotFoundException;

public interface GenericDao <E,K> {
	
	void insert (E entidade);
	
	E select (K id) throws EntityNotFoundException;
	
	void delete(K id) throws EntityNotFoundException;
	
	void update (E entidade);
	
	void commit() throws CommitException;
}
