package br.com.fiap.cp1.view;

import javax.persistence.EntityManager;

import br.com.fiap.cp1.dao.CinemaDao;
import br.com.fiap.cp1.dao.impl.CinemaDaoImpl;
import br.com.fiap.cp1.entity.Cinema;
import br.com.fiap.cp1.exception.CommitException;
import br.com.fiap.cp1.singleton.EntityManagerFactorySingleton;
//import br.com.fiap.cp1.exception.EntityNotFoundException;

public class CinemaDaoTeste {

	public static void main(String[] args) {
		
		
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		CinemaDao dao = new CinemaDaoImpl(em);
		
		
		// ---------- Cadastro de um novo Cinema ---------
		Cinema cinema = new Cinema ("Cinelópolis", "45214778951432", "Av. Interlagos, 2255");
		 try {
			dao.insert(cinema);
			dao.commit();
			System.out.println("Cinema Cadastrado!");
		} catch (CommitException e) {
			System.out.println(e.getMessage());
		} 
		
		/* 
		// ----------- Pesquisar um Cinema ----------
		try {
			cinema = dao.select(1);
			System.out.println("Nome Cinema: " + cinema.getNome() + " Número CNPJ:" + 
			cinema.getCnpj() + " Endereço Cinema: " + cinema.getEndereco());
		} catch (EntityNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		// ----------- Atualizar Cinema ----------
		cinema = new Cinema (1, "Cinemark", "48219268951432", "Av. Interlagos, 2255");
		try {
			dao.update(cinema);
			dao.commit();
			System.out.println("Cinema Atualizado!");
		} catch (CommitException e) {
			System.out.println(e.getMessage());
		}
		
		// ---------- Remover Cinema -----------
		try {
			dao.delete(1);
			dao.commit();
			System.out.println("Cinema removido!");
		} catch (CommitException | EntityNotFoundException e) {
			System.out.println(e.getMessage());
		} */
		
		//Fechando o EntityManager
		em.close();
		EntityManagerFactorySingleton.getInstance().close();
	}
	
}
