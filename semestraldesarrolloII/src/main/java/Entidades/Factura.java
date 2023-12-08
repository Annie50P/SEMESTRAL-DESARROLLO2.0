package Entidades;

public class Factura {
	private int idFactura, idReserva, idMetodoPago;
	private double monto;
	private String fechaExp;
	
	public Factura() {
		
	}
	public Factura(int idFactura, int idReserva, int idMetodoPago, double monto, String fechaExp) {
		super();
		this.idFactura = idFactura;
		this.idReserva = idReserva;
		this.idMetodoPago = idMetodoPago;
		this.monto = monto;
		this.fechaExp = fechaExp;
	}
	public int getIdFactura() {
		return idFactura;
	}
	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}
	public int getIdReserva() {
		return idReserva;
	}
	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}
	public int getIdMetodoPago() {
		return idMetodoPago;
	}
	public void setIdMetodoPago(int idMetodoPago) {
		this.idMetodoPago = idMetodoPago;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public String getFechaExp() {
		return fechaExp;
	}
	public void setFechaExp(String fechaExp) {
		this.fechaExp = fechaExp;
	}
	
}
