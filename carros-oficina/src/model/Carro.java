package model;

public class Carro {
	
	private int id;
	private String modelo;
	private String cor;
	private int ano;
	private String placa;
	
	
	public Carro(int id, String modelo, String cor, int ano, String placa) {
		super();
		this.id = id;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.placa = placa;
	}
	
	
	public Carro(String modelo, String cor, int ano, String placa) {
		super();
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.placa = placa;
	}
	public Carro() {
		
	}	


	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	@Override
    public String toString() {
        return "Carro {" +
                "id=" + id +
                ", modelo='" + modelo + '\'' +
                ", cor=" + cor +
                ", ano=" + ano +
                "placa=" + placa +
                '}';
    }

}
