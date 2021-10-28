package br.com.fiap.cp1.view;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;

import br.com.fiap.cp1.dao.HorarioDao;
import br.com.fiap.cp1.dao.impl.HorarioDaoImpl;
import br.com.fiap.cp1.entity.Horario;
import br.com.fiap.cp1.exception.CommitException;
import br.com.fiap.cp1.singleton.EntityManagerFactorySingleton;

public class HorarioDaoTeste {

	public static void main(String[] args) {
		
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		HorarioDao dao = new HorarioDaoImpl(em);
		
		// ----- Cadastro -----
		Horario horario = new Horario (new GregorianCalendar (2021, Calendar.FEBRUARY, 18, Calendar.HOUR_OF_DAY, 18), "Caixa");
		try {
			dao.insert(horario);
			dao.commit();
			System.out.println("Horário Cadastrado com sucesso!");
		} catch (CommitException e) {
			System.out.println(e.getMessage());
		}
		em.close();
		EntityManagerFactorySingleton.getInstance().close();
	}
	
}
