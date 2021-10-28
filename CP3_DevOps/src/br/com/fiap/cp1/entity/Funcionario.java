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
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "T_FUNCIONARIO", uniqueConstraints = {@UniqueConstraint(columnNames = "numero_cpf", name = "UN_FUNCINARIO_CPF"),
	   @UniqueConstraint(columnNames = "numero_ctps", name = "UN_FUNCIONARIO_CTPS")})
@SequenceGenerator(name = "funcionario", sequenceName = "SQ_T_FUNCIONARIO", allocationSize = 1)
public class Funcionario {

	@Id
	@Column(name = "id_funcionario")
	@GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "func")
	private int id;
	
	@Column(name = "nm_funcionario", nullable = false, length = 40)
	private String nome;
	
	@Column(name = "numero_cpf", nullable = false, length = 11)
	private String cpf;
	
	@Column(name = "numero_ctps", nullable = false, length = 16)
	private String ctps;
	
	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	@Column(name = "data_admissao", updatable = false)
	private Calendar dataAdmissao;
	
	@Column(name = "vl_salario", nullable = false)
	private Double salario;
	
	public Funcionario () {
		
	}
	
	public Funcionario(String nome, String cpf, String ctps, Calendar dataAdmissao, Double salario) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.ctps = ctps;
		this.dataAdmissao = dataAdmissao;
		this.salario = salario;
	}
	
	public Funcionario(int id, String nome, String cpf, String ctps, Calendar dataAdmissao, Double salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.ctps = ctps;
		this.dataAdmissao = dataAdmissao;
		this.salario = salario;
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCtps() {
		return ctps;
	}
	public void setCtps(String ctps) {
		this.ctps = ctps;
	}
	public Calendar getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(Calendar dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
}
