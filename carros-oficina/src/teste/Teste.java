package teste;

import java.util.List;

import dao.CarroDAO;
import model.Carro;

public class Teste {

	public static void main(String[] args) {
		//Carro c = new Carro("Renault Sandero", "Azul", 2018, "CLD-2018");
		CarroDAO acessoCarro =  new CarroDAO();
		
		//Carro carro = acessoCarro.buscaPorPlaca("ABC-2018");
		//System.out.println(carro.toString());
		//carro.setCor("Azul Mar");
		//acessoCarro.atualizar(carro);
		
		
		List<Carro> a = acessoCarro.buscaTodos();
		for (Carro ava : a ) {
			System.out.println(a.toString());
		}
		/*
		carro.setPlaca(rs.getString("placa"));
		
		
		
		statement.setInt(5, carro.getId());
		Acessorio a = new Acessorio("freio abs", 3);
		AcessoriosDAO acessoAcessorio = new AcessoriosDAO();
		acessoAcessorio.inserir(a);
		carro.setCor("Pink Limonade");
		carro.atualizar(carro);
		System.out.println(carro.toString());
		Avaria avarias = new Avaria("motor", "vela de ignição", 3);
		AvariasDAO acessoAvarias = new AvariasDAO();
		acessoAvarias.inserir(avarias); 
		statement.setString(5, carro.getId());
		/*
		
		AvariasDAO acessoAvarias = new AvariasDAO();
		
		List<Avaria> a = acessoAvarias.buscarPorPlaca("ABC-2018");
		for (Avaria ava : a ) {
			System.out.println(a.toString());
		}
		*/
		

	}

}
