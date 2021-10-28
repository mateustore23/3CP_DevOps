package br.com.fiap.cp1.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "T_FILME")
@SequenceGenerator(name = "filme", sequenceName = "SQ_T_FILME", allocationSize = 1)
public class Filme {

	@Id
	@Column(name = "id_filme")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "film")
	private int id;
	
	@Column(name = "nome_portugues", nullable = false, length = 80)
	private String nomePortugues;
	
	@Column(name = "nome_original", nullable = false, length = 80)
	private String nomeOriginal;
	
	@Column(name = "nome_diretor", nullable = false, length = 40)
	private String diretor;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "ano_lancamento", nullable = false, updatable = false)
	private Calendar dataLancamento;
	
	@Column(name = "ds_genero", nullable = false, length = 20)
	private Genero genero;
	
	public Filme () {
		
	}
	
	public Filme(String nomePortugues, String nomeOriginal, String diretor, Calendar dataLancamento, Genero genero) {
		super();
		this.nomePortugues = nomePortugues;
		this.nomeOriginal = nomeOriginal;
		this.diretor = diretor;
		this.dataLancamento = dataLancamento;
		this.genero = genero;
	}
	
	public Filme(int id, String nomePortugues, String nomeOriginal, String diretor, Calendar dataLancamento,
			Genero genero) {
		super();
		this.id = id;
		this.nomePortugues = nomePortugues;
		this.nomeOriginal = nomeOriginal;
		this.diretor = diretor;
		this.dataLancamento = dataLancamento;
		this.genero = genero;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomePortugues() {
		return nomePortugues;
	}
	public void setNomePortugues(String nomePortugues) {
		this.nomePortugues = nomePortugues;
	}
	public String getNomeOriginal() {
		return nomeOriginal;
	}
	public void setNomeOriginal(String nomeOriginal) {
		this.nomeOriginal = nomeOriginal;
	}
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	public Calendar getDataLancamento() {
		return dataLancamento;
	}
	public void setDataLancamento(Calendar dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	
}
