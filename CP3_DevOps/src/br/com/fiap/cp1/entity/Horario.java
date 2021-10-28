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
@Table(name = "T_HORARIO")
@SequenceGenerator(name = "horario", sequenceName = "SQ_T_HORARIO", allocationSize = 1)
public class Horario {
	
	
	@Id
	@Column(name = "id_horario")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hour")
	private int id;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_horario", nullable = false)
	private Calendar horario;
	
	@Column(name = "funcao_funcionario", nullable = false, length = 20)
	private String funcaoFuncionario;
	
	public Horario () {
		
	}
	
	public Horario(int id, Calendar horario, String funcaoFuncionario) {
		super();
		this.id = id;
		this.horario = horario;
		this.funcaoFuncionario = funcaoFuncionario;
	}
	
	public Horario(Calendar horario, String funcaoFuncionario) {
		super();
		this.horario = horario;
		this.funcaoFuncionario = funcaoFuncionario;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Calendar getHorario() {
		return horario;
	}
	public void setHorario(Calendar horario) {
		this.horario = horario;
	}


	public String getFuncaoFuncionario() {
		return funcaoFuncionario;
	}


	public void setFuncaoFuncionario(String funcaoFuncionario) {
		this.funcaoFuncionario = funcaoFuncionario;
	}
	
}
