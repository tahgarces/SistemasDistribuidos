package com.atividade.teste;

import java.util.Calendar;

import com.atividade.entidade.Aluno;
import com.atividade.entidade.Mensalidade;
import com.atividade.repositorio.RepositorioAluno;
import com.atividade.repositorio.RepositorioMensalidade;

public class Teste {

	public static void main(String[] args) {
		//RepositorioAluno repo = new RepositorioAluno();
		RepositorioMensalidade mens = new RepositorioMensalidade();
		
			
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2018);
		cal.set(Calendar.MONTH, Calendar.DECEMBER);
		cal.set(2019, 2, 13);
		
		Aluno aluno2 = new Aluno("Maria", "taynaragarces@gmail.com", "98984018000");
		Mensalidade mensalidade = new Mensalidade(aluno2, cal, null);
		
		//repo.salvarAlunos(aluno2);
		mens.salvarMensalidade(mensalidade);
		
	}

}
