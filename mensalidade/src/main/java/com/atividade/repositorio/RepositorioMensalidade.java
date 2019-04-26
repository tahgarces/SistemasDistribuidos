package com.atividade.repositorio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.atividade.entidade.Mensalidade;

public class RepositorioMensalidade {
	
	EntityManagerFactory emf;
	EntityManager em;
	
	public RepositorioMensalidade() {
		emf = Persistence.createEntityManagerFactory("teste");
		em = emf.createEntityManager();
	}
		
	public void salvarMensalidade(Mensalidade mensalidade) {
		em.getTransaction().begin();
		em.merge(mensalidade);
		em.getTransaction().commit();
		emf.close();
	}
	
	public void excluirMensalidade(Mensalidade mensalidade) {
		em.getTransaction().begin();
		em.remove(mensalidade);
		em.getTransaction().commit();
		emf.close();
	}
	
	public List<Mensalidade> listarMensalidade(){
		em.getTransaction().begin();
		Query consulta = em.createQuery("select aluno from Mensalidade mensalidade");
		@SuppressWarnings("unchecked")
		List<Mensalidade> mensalidade = consulta.getResultList();
		
		em.getTransaction().commit();
		emf.close();
		return mensalidade;
	}
}