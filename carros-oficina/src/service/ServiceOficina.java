package service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import dao.CarroDAO;
import model.Carro;

@Path("oficina")
public class ServiceOficina {

	@POST
	@Path("adicionar")
	@Consumes(MediaType.APPLICATION_JSON)
	public void inserirCarro(Carro carro) {		
		CarroDAO carros = new CarroDAO();
		carros.inserir(carro);		
	}
	
	@PUT
	@Path("atualizar")
	@Consumes(MediaType.APPLICATION_JSON)
	public void atualizarCarro(Carro carro) {		
		CarroDAO carros = new CarroDAO();
		carros.atualizar(carro);	
	}
	
	@GET	
	@Path("listarUmCarro")
	@Produces(MediaType.APPLICATION_JSON)
	public Carro retornaCarro(String placa) {
		CarroDAO carro = new CarroDAO();
		return carro.buscaPorPlaca(placa);				
	}
	
	@GET	
	@Path("listarCarros")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Carro> retornaTodosCarros() {
		CarroDAO carro = new CarroDAO();
		return carro.buscaTodos();				
	}
	
	@GET	
	@Path("teste")
	@Produces(MediaType.APPLICATION_JSON)
	public String teste() {
		return "ola";
	}
	
	@GET	
	@Path("listarCarrosAno")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Carro> retornaCarroPorAno(int ano) {
		CarroDAO carro = new CarroDAO();
		return carro.buscaPorAno(ano);				
	}
	
	@GET	
	@Path("listarCarrosModelo")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Carro> retornaCarroPorModelo(String modelo) {
		CarroDAO carro = new CarroDAO();
		return carro.buscaPorModelo(modelo);				
	}
	
	@DELETE	
	@Path("deletarCarro")
	@Produces(MediaType.APPLICATION_JSON)
	public void deletarCarro(String placa) {
		CarroDAO carro = new CarroDAO();
		carro.deletar(placa);			
	}
	
	
}
