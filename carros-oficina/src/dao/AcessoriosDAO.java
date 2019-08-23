package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import Connection.ConnectionFactory;
import model.Acessorio;


public class AcessoriosDAO {
	

	public void inserir(Acessorio acessorio ) {
		try {
			Connection connection = ConnectionFactory.getInstance().getConnection();
			
			String sql = "insert into acessorios (acessorio, idcarro) values (?, ?)";
			PreparedStatement statement = connection.prepareStatement(sql);
			
			statement.setString(1, acessorio.getAcessorio());
			statement.setInt(2, acessorio.getIdCarro());
						
			statement.execute();
			statement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	

	public List<Acessorio> consultar(){
		ArrayList<Acessorio> lista = new ArrayList<Acessorio>();
		try {
			Connection connection = ConnectionFactory.getInstance().getConnection();
			String sql = "select * from acessorios";
			PreparedStatement statement = connection.prepareStatement(sql);
			
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {
				lista.add(new Acessorio(
						rs.getInt("id"),
						rs.getString("nome")
						));
			}
			
			statement.execute();
			statement.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return lista;
	}
	

	public List<Acessorio> buscarPorPlaca(String placa){
		ArrayList<Acessorio> lista = new ArrayList<Acessorio>();
		try {
			Connection connection = ConnectionFactory.getInstance().getConnection();
			String sql = "select acessorio from acessorios a, carro c where c.id = a.idcarro and c.placa like ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			
			statement.setString(1, placa);
			
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {
				lista.add(new Acessorio(						
						rs.getString("acessorio")
					));
			}
			
			statement.execute();
			statement.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return lista;
	}

	
}
