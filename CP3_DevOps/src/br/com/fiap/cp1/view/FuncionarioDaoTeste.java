package br.com.fiap.cp1.view;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;

import br.com.fiap.cp1.dao.FuncionarioDao;
import br.com.fiap.cp1.dao.impl.FuncionarioDaoImpl;
import br.com.fiap.cp1.entity.Funcionario;
import br.com.fiap.cp1.exception.CommitException;
import br.com.fiap.cp1.singleton.EntityManagerFactorySingleton;

public class FuncionarioDaoTeste {

	public static void main(String[] args) {
		
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		FuncionarioDao dao = new FuncionarioDaoImpl(em);
		
		Funcionario funcionario = new Funcionario ("Juliana", "39206555296", "2569871245387521",
				new GregorianCalendar (2020, Calendar.JANUARY, 27), 1250.00);
		try {
			dao.insert(funcionario);
			dao.commit();
			System.out.println("Funcionário Cadastrado!");
		} catch (CommitException e) {
			System.out.println(e.getMessage());
		}
		em.close();
		EntityManagerFactorySingleton.getInstance().close();
	}
	
}
