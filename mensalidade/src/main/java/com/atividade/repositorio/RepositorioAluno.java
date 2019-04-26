package com.atividade.repositorio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.atividade.entidade.Aluno;

public class RepositorioAluno {
	
	EntityManagerFactory emf;
	EntityManager em;
	
	public RepositorioAluno() {
		emf = Persistence.createEntityManagerFactory("teste");
		em = emf.createEntityManager();
	}
	
	
	public void salvarAlunos(Aluno aluno) {
		em.getTransaction().begin();
		em.merge(aluno);
		em.getTransaction().commit();
		emf.close();
	}
	
	public void excluirAlunos(Aluno aluno) {
		em.getTransaction().begin();
		em.remove(aluno);
		em.getTransaction().commit();
		emf.close();
	}
	
	public List<Aluno> listarAlunos(){
		em.getTransaction().begin();
		Query consulta = em.createQuery("select aluno from Aluno aluno");
		@SuppressWarnings("unchecked")
		List<Aluno> aluno = consulta.getResultList();
		
		em.getTransaction().commit();
		emf.close();
		return aluno;
	}
}