package br.com.fiap.cp1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "T_SALA_FILME")
@SequenceGenerator(name = "salaFilme", sequenceName = "SQ_T_SALA_FILME", allocationSize = 1)
public class SalaFilme {

	@Id
	@Column(name = "id_sala_filme")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "roomFilm")
	private int id;
	
	public SalaFilme () {
		
	}

	public SalaFilme(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
