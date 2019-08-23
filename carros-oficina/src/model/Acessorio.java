package model;

public class Acessorio {
	
	private int id;
	private String acessorio;
	private int idCarro;
	
	public Acessorio(int id, String acessorio) {		
		this.id = id;
		this.acessorio = acessorio;
	}
	
	public Acessorio(String acessorio) {		
		this.acessorio = acessorio;
	}
	
	public Acessorio(String acessorio, int idCarro) {		
		this.acessorio = acessorio;
		this.idCarro = idCarro;
	}
	
	public Acessorio() {		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAcessorio() {
		return acessorio;
	}

	public void setAcessorio(String acessorio) {
		this.acessorio = acessorio;
	}

	public int getIdCarro() {
		return idCarro;
	}

	public void setIdCarro(int idCarro) {
		this.idCarro = idCarro;
	}
	
	@Override
    public String toString() {
        return "Acessorio {" +
                "id=" + id +
                ", modelo='" + acessorio + '\'' +                
                '}';
    }
	
}
