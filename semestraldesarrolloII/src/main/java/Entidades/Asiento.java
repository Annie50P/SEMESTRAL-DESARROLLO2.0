package Entidades;

public class Asiento {
	private int idAsiento, idVuelo;
	private String estado;
	
	public Asiento() {
		
	}
	public Asiento(int idAsiento, int idVuelo, String estado) {
		super();
		this.idAsiento = idAsiento;
		this.idVuelo = idVuelo;
		this.estado = estado;
	}
	public int getIdAsiento() {
		return idAsiento;
	}
	public void setIdAsiento(int idAsiento) {
		this.idAsiento = idAsiento;
	}
	public int getIdVuelo() {
		return idVuelo;
	}
	public void setIdVuelo(int idVuelo) {
		this.idVuelo = idVuelo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
