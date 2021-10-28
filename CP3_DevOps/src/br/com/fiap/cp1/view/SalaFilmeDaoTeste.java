package br.com.fiap.cp1.view;

import javax.persistence.EntityManager;

import br.com.fiap.cp1.dao.SalaFilmeDao;
import br.com.fiap.cp1.dao.impl.SalaFilmeDaoImpl;
import br.com.fiap.cp1.entity.SalaFilme;
import br.com.fiap.cp1.exception.CommitException;
import br.com.fiap.cp1.singleton.EntityManagerFactorySingleton;

public class SalaFilmeDaoTeste {
		
	public static void main(String[] args) {
		
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		
		SalaFilmeDao dao = new SalaFilmeDaoImpl(em);
		
		// ----- Cadastro -----
		SalaFilme salaFilme = new SalaFilme();
		try {
			dao.insert(salaFilme);
			dao.commit();
			System.out.println("SalaFilme cadastrada!");
		} catch (CommitException e) {
			System.out.println(e.getMessage());
		}
		em.close();
		EntityManagerFactorySingleton.getInstance().close();
	}
	
}
