package Entidades;

public class Aeropuerto {
	private int idAeropuerto;
	private String pais;
	private char codigoIata;
	
	public Aeropuerto() {
		
	}
	public Aeropuerto(int idAeropuerto, String pais, char iata) {
		super();
		this.idAeropuerto = idAeropuerto;
		this.pais = pais;
		this.codigoIata = iata;
	}
	public int getIdAeropuerto() {
		return idAeropuerto;
	}
	public void setIdAeropuerto(int idAeropuerto) {
		this.idAeropuerto = idAeropuerto;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public char getCodigoIata() {
		return codigoIata;
	}
	public void setCodigoIata(char codigoIata) {
		this.codigoIata = codigoIata;
	}
	
}
