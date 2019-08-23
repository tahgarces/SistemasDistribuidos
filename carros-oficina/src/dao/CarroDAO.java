package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



import Connection.ConnectionFactory;
import model.Carro;


public class CarroDAO {	

	public void inserir(Carro carro) {
		try {
			Connection connection = ConnectionFactory.getInstance().getConnection();
			
			String sql = "insert into carro (modelo, cor, ano, placa) values (?, ?, ?, ?)";
			PreparedStatement statement = connection.prepareStatement(sql);
			
			statement.setString(1, carro.getModelo());	
			statement.setString(2, carro.getCor());	
			statement.setInt(3, carro.getAno());	
			statement.setString(4, carro.getPlaca());				
			
			statement.execute();
			statement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	 public void atualizar(Carro carro){		 
		 
		 	try{
		 		Connection connection = ConnectionFactory.getInstance().getConnection();			 
			 	String sql = "update carro set modelo = ?, cor = ?, ano = ?, placa = ? where id = ?";
			 	PreparedStatement statement = connection.prepareStatement(sql);
		 		
		 	
	            statement.setString(1, carro.getModelo());	
				statement.setString(2, carro.getCor());	
				statement.setInt(3, carro.getAno());	
				statement.setString(4, carro.getPlaca());
				statement.setInt(5, carro.getId());

	            statement.executeUpdate();
	            statement.close();
	        }catch (Exception e){
	            e.printStackTrace();
	        }
		 }
	
	 
	
	 
	 
	 
	 
	
	
	public List<Carro> buscaPorModelo(String modelo) {
		
		List<Carro> carros = new ArrayList<Carro>();
		try {
			Connection connection = ConnectionFactory.getInstance().getConnection();
			
			String sql = "select * from carro where modelo like ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			
			statement.setString(1, modelo);
			
			ResultSet rs = statement.executeQuery();
			
			while (rs.next()) {
				
                Carro carro = new Carro();
                carro.setId(rs.getInt("id"));
                carro.setModelo(rs.getString("modelo"));
                carro.setCor(rs.getString("cor"));
                carro.setAno(rs.getInt("ano"));
                carros.add(carro);
            }
			
			rs.close();
			statement.close();
			return carros;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	

	public Carro buscaPorPlaca(String placa) {
		
		Carro carro = null;
		try {
			Connection connection = ConnectionFactory.getInstance().getConnection();
			
			String sql = "select * from carro where placa like ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			
			statement.setString(1, placa);
			
			ResultSet rs = statement.executeQuery();
			
			while (rs.next()) {				
                carro = new Carro();
                carro.setId(rs.getInt("id"));
                carro.setModelo(rs.getString("modelo"));
                carro.setCor(rs.getString("cor"));
                carro.setAno(rs.getInt("ano"));
                carro.setPlaca(rs.getString("placa"));
                
            }
			
			rs.close();
			statement.close();
			return carro;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	public List<Carro> buscaPorAno(int ano) {
		
		List<Carro> carros = new ArrayList<Carro>();
		try {
			Connection connection = ConnectionFactory.getInstance().getConnection();
			
			String sql = "select * from carro where ano like ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			
			statement.setInt(1, ano);
			
			ResultSet rs = statement.executeQuery();
			
			while (rs.next()) {				
                Carro carro = new Carro();
                carro.setId(rs.getInt("id"));
                carro.setModelo(rs.getString("modelo"));
                carro.setCor(rs.getString("cor"));
                carro.setAno(rs.getInt("ano"));
                carros.add(carro);
            }
			
			rs.close();
			statement.close();
			return carros;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	public List<Carro> buscaTodos() {
		
		List<Carro> carros = new ArrayList<Carro>();
		try {
			Connection connection = ConnectionFactory.getInstance().getConnection();
			
			String sql = "select * from carro";
			PreparedStatement statement = connection.prepareStatement(sql);
			
			ResultSet rs = statement.executeQuery();
			
			while (rs.next()) {				
                Carro carro = new Carro();
                carro.setId(rs.getInt("id"));
                carro.setModelo(rs.getString("modelo"));
                carro.setCor(rs.getString("cor"));
                carro.setAno(rs.getInt("ano"));
                carros.add(carro);
            }
			
			rs.close();
			statement.close();
			return carros;
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return null;
	}
	
	public void deletar(String placa) {
		try {
			Connection connection = ConnectionFactory.getInstance().getConnection();
			
			String sql = "delete from carro where placa = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			
			;	
			statement.setString(1, placa);				
			
			statement.execute();
			statement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
