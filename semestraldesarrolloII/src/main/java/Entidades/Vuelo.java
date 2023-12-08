package Entidades;

public class Vuelo {
	private int idVuelo, idTarifa, idOrigen, idDestino;
	private String fechaLlegada, fechaSalida;
	
	public Vuelo() {
		
	}
	public Vuelo(int idVuelo, int idTarifa, int idOrigen, int idDestino, String fechaLlegada, String fechaSalida) {
		super();
		this.idVuelo = idVuelo;
		this.idTarifa = idTarifa;
		this.idOrigen = idOrigen;
		this.idDestino = idDestino;
		this.fechaLlegada = fechaLlegada;
		this.fechaSalida = fechaSalida;
	}
	public int getIdVuelo() {
		return idVuelo;
	}
	public void setIdVuelo(int idVuelo) {
		this.idVuelo = idVuelo;
	}
	public int getIdTarifa() {
		return idTarifa;
	}
	public void setIdTarifa(int idTarifa) {
		this.idTarifa = idTarifa;
	}
	public int getIdOrigen() {
		return idOrigen;
	}
	public void setIdOrigen(int idOrigen) {
		this.idOrigen = idOrigen;
	}
	public int getIdDestino() {
		return idDestino;
	}
	public void setIdDestino(int idDestino) {
		this.idDestino = idDestino;
	}
	public String getFechaLlegada() {
		return fechaLlegada;
	}
	public void setFechaLlegada(String fechaLlegada) {
		this.fechaLlegada = fechaLlegada;
	}
	public String getFechaSalida() {
		return fechaSalida;
	}
	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	
}
