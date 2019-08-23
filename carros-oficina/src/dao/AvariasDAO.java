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
import model.Avaria;



public class AvariasDAO {


	public void inserir(Avaria avaria ) {
		try {
			Connection connection = ConnectionFactory.getInstance().getConnection();
			
			String sql = "insert into avarias (nome, descricao, idCarro) values (?, ?, ?)";
			PreparedStatement statement = connection.prepareStatement(sql);
			
			statement.setString(1, avaria.getAvaria());
			statement.setString(2, avaria.getDescricao());
			statement.setInt(3, avaria.getIdCarro());
						
			statement.execute();
			statement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	

	public List<Avaria> consultar(){
		ArrayList<Avaria> lista = new ArrayList<Avaria>();
		try {
			Connection connection = ConnectionFactory.getInstance().getConnection();
			String sql = "select * from avarias";
			PreparedStatement statement = connection.prepareStatement(sql);
			
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {
				lista.add(new Avaria(
						
						rs.getString("nome"),
						rs.getString("descricao"),
						rs.getInt("idCarro")
						));
			}
			
			statement.execute();
			statement.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return lista;
	}
	

	public List<Avaria> buscarPorPlaca(String placa){
		ArrayList<Avaria> lista = new ArrayList<Avaria>();
		try {
			Connection connection = ConnectionFactory.getInstance().getConnection();
			String sql = "select * from avarias a, carro c where c.id = a.idcarro and c.placa like ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			
			statement.setString(1, placa);
			
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {
				lista.add(new Avaria(						
						rs.getString("nome"),
						rs.getString("descricao")
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
