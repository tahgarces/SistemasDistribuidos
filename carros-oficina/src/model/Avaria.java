package model;

public class Avaria {
	
	private int id;
	private String avaria;
	private int idCarro;
	private String descricao;
	
	
	
	public Avaria(int id, String avaria, int idCarro, String descricao) {
		this.id = id;
		this.avaria = avaria;
		this.idCarro = idCarro;
		this.descricao = descricao;
	}
	
	public Avaria(String avaria, String descricao, int idCarro) {
		this.avaria = avaria;
		this.idCarro = idCarro;
		this.descricao = descricao;
	}
	
	public Avaria( String avaria, String descricao) {
		this.avaria = avaria;
		this.descricao = descricao;
	}
	
	public Avaria() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAvaria() {
		return avaria;
	}
	public void setAvaria(String avaria) {
		this.avaria = avaria;
	}
	public int getIdCarro() {
		return idCarro;
	}
	public void setIdCarro(int idCarro) {
		this.idCarro = idCarro;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao( String descricao) {
		this.descricao = descricao;
	}
	
	@Override
    public String toString() {
        return "Avaria {" +
                "id=" + id +
                ", avaria='" + avaria  +           
                ", descricao='" + descricao + 
                '}';
    }
	
	
}
