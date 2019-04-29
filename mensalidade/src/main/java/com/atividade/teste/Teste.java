package com.atividade.teste;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.atividade.entidade.Aluno;
import com.atividade.entidade.Mensalidade;


public class Teste {

	public static void main(String[] args) {
					
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2018);
		cal.set(Calendar.MONTH, Calendar.DECEMBER);
		cal.set(2019, 2, 13);	
		
		Aluno aluno2 = new Aluno("Maria", "taynaragarces@gmail.com", "98984018000");
		Mensalidade mensalidade = new Mensalidade(aluno2, cal, cal);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("teste");		
		EntityManager em = emf.createEntityManager();
		
		
		
		em.getTransaction().begin();
		em.persist(aluno2);
		em.getTransaction().commit();
		emf.close();
		

		em.getTransaction().begin();
		em.persist(mensalidade);
		em.getTransaction().commit();
		emf.close();
		
		
		
	}

}
