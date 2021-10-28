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
@Table(name = "T_CINEMA", uniqueConstraints = @UniqueConstraint(columnNames = "numero_cnpj", name = "UN_CINEMA_CNPJ"))
@SequenceGenerator(name = "cinema", sequenceName = "SQ_T_CINEMA", allocationSize = 1)
public class Cinema {

	@Id
	@Column(name = "id_cinema")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cine")
	private int id;
	
	@Column(name = "nome_cinema", nullable = false, length = 40)
	private String nome;
	
	@Column(name = "numero_cnpj", nullable = false, length  = 14)
	private String cnpj;
	
	@Column(name = "ds_endereco", nullable = false, length = 50)
	private String endereco;
	
	public Cinema () {
		
	}
	
	public Cinema( String nome, String cnpj, String endereco) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.endereco = endereco;
	}
	
	public Cinema(int id, String nome, String cnpj, String endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.cnpj = cnpj;
		this.endereco = endereco;
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
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
}
