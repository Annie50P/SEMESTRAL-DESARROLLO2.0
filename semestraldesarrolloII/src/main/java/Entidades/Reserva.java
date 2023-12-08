package Entidades;

public class Reserva {
	private int idReserva, idUsuario, idVuelo, idAsiento, cantidad;
	private String fechaReserva, estadoReserva;
	
	public Reserva() {
		
	}

	public Reserva(int idReserva, int idUsuario, int idVuelo, int idAsiento, int cantidad, String fechaReserva,
			String estadoReserva) {
		super();
		this.idReserva = idReserva;
		this.idUsuario = idUsuario;
		this.idVuelo = idVuelo;
		this.idAsiento = idAsiento;
		this.cantidad = cantidad;
		this.fechaReserva = fechaReserva;
		this.estadoReserva = estadoReserva;
	}

	public int getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(int idVuelo) {
		this.idVuelo = idVuelo;
	}

	public int getIdAsiento() {
		return idAsiento;
	}

	public void setIdAsiento(int idAsiento) {
		this.idAsiento = idAsiento;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getFechaReserva() {
		return fechaReserva;
	}

	public void setFechaReserva(String fechaReserva) {
		this.fechaReserva = fechaReserva;
	}

	public String getEstadoReserva() {
		return estadoReserva;
	}

	public void setEstadoReserva(String estadoReserva) {
		this.estadoReserva = estadoReserva;
	}
	
}
