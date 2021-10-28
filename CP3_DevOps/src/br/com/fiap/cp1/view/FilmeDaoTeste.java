package br.com.fiap.cp1.view;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;

import br.com.fiap.cp1.dao.FilmeDao;
import br.com.fiap.cp1.dao.impl.FilmeDaoImpl;
import br.com.fiap.cp1.entity.Filme;
import br.com.fiap.cp1.entity.Genero;
import br.com.fiap.cp1.exception.CommitException;
import br.com.fiap.cp1.singleton.EntityManagerFactorySingleton;

public class FilmeDaoTeste {
	
	public static void main(String[] args) {
		
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		FilmeDao dao = new FilmeDaoImpl(em);
		
		
		// ----- Cadastro -----
		Filme filme = new Filme ("Harry Potter e a pedra Filosofal", "Harry Potter and Philosopher's Stone", 
				"Chris Colombus", new GregorianCalendar(2002, Calendar.MAY, 11), Genero.FANTASIA);
		try {
			dao.insert(filme);
			dao.commit();
			System.out.println("Filme Cadastrado!");
		} catch (CommitException e) {
			System.out.println(e.getMessage());
		}
		
		em.close();
		EntityManagerFactorySingleton.getInstance().close();
		
	}
	
}
