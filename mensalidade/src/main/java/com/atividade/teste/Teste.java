package com.atividade.teste;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.atividade.entidade.Aluno;
import com.atividade.entidade.Mensalidade;


public class Teste {
	
	public static List<Mensalidade> verificaAtraso() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("teste");		
		EntityManager em = emf.createEntityManager();
		
		TypedQuery query = em.createQuery("select m from mensalidade as m where m.statusPagamento=true", Mensalidade.class);
		//List<Mensalidade> listaMensalidade = new
		
		List<Mensalidade> listaEmAberto =query.getResultList();
		List<Mensalidade> listaEmAtraso = new ArrayList();
		for(int i = 0; i<listaEmAberto.size(); i++) {
			System.out.printf("\n1");
			if(listaEmAberto.get(i).getDataVencimento().before(LocalDate.now()))
				System.out.println("Ok");
				listaEmAtraso.add(listaEmAberto.get(i));
			}
		return listaEmAtraso;
		}
		
	
	public static void main(String[] args) {

					
		/*Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2018);
		cal.set(Calendar.MONTH, Calendar.DECEMBER);
		cal.set(2019, 2, 13);	
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("teste");		
		EntityManager em = emf.createEntityManager();
		
		Aluno aluno2 = new Aluno("Maria", "taynaragarces@gmail.com", "98984018000");
		Mensalidade mensalidade = new Mensalidade(aluno2, cal, cal);
		
		
		
		em.getTransaction().begin();
		em.persist(aluno2);
		em.persist(mensalidade);
		em.getTransaction().commit();
		emf.close();*/
		
	
		System.out.println(verificaAtraso().get(1));
		
	
		
	}

}
