package br.com.fiap.cp1.view;

import javax.persistence.EntityManager;

import br.com.fiap.cp1.dao.SalaDao;
import br.com.fiap.cp1.dao.impl.SalaDaoImpl;
import br.com.fiap.cp1.entity.Sala;
import br.com.fiap.cp1.exception.CommitException;
import br.com.fiap.cp1.singleton.EntityManagerFactorySingleton;

public class SalaDaoTeste {
	
	public static void main(String[] args) {
		
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		SalaDao dao = new SalaDaoImpl(em);
		
		// ----- Cadastro -----
		Sala sala = new Sala ("Especial 02", 45);
		try {
			dao.insert(sala);
			dao.commit();
			System.out.println("Sala Cadastrada!");
		} catch (CommitException e) {
			System.out.println(e.getMessage());
		}
		em.close();
		EntityManagerFactorySingleton.getInstance().close();
	}
}
