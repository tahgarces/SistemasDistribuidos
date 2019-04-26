package com.atividade.entidade;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="mensalidade")
public class Mensalidade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
    @JoinColumn(name="id_aluno")
	private Aluno aluno;
	
	@Temporal(TemporalType.DATE)
	private Calendar dataVencimento;
	@Temporal(TemporalType.DATE)
	private Calendar dataPagamento;
	
	private boolean statusPagamento;
	
	public Mensalidade() {
		
	}
	
	public Mensalidade(Aluno aluno, Calendar dataVencimento, Calendar dataPagamento) {
		this.aluno = aluno;
		this.dataVencimento =  dataVencimento;
		this.dataPagamento = dataPagamento;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Calendar getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Calendar dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Calendar getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Calendar dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public boolean isStatusPagamento() {
		return statusPagamento;
	}

	public void setStatusPagamento(boolean statusPagamento) {
		this.statusPagamento = statusPagamento;
	}
	
	
	
}
