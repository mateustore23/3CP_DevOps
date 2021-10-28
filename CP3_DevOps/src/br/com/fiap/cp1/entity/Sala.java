package br.com.fiap.cp1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "T_SALA", uniqueConstraints = @UniqueConstraint(columnNames = "nm_sala", name = "UN_SALA_NOME"))
@SequenceGenerator(name = "sala", sequenceName = "SQ_T_SALA", allocationSize = 1)
public class Sala {
	
	@Id
	@Column(name = "id_sala")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "room")
	private int id;
	
	@Column(name = "nm_sala", nullable = false, length = 15)
	private String nome;
	
	@Column(name = "qnt_capacidade", nullable = false)
	private int capacidade;
	
	public Sala () {
		
	}
	
	public Sala(int id, String nome, int capacidade) {
		super();
		this.id = id;
		this.nome = nome;
		this.capacidade = capacidade;
	}

	public Sala(String nome, int capacidade) {
		super();
		this.nome = nome;
		this.capacidade = capacidade;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
}
