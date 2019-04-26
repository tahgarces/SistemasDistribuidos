package com.atividade.teste;

import com.atividade.entidade.Aluno;
import com.atividade.repositorio.RepositorioAluno;

public class Teste {

	public static void main(String[] args) {
		RepositorioAluno repo = new RepositorioAluno();
		Aluno aluno = new Aluno("Taynara Garces de Lima", "taynaragarces@gmail.com", "98984018000");
		
		repo.salvarAlunos(aluno);
		

	}

}
