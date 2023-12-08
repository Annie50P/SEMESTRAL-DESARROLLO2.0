package Entidades;

public class Tarifa {
	private int idTarifa;
	private String tipoTarifa;
	private double monto;
	
	public Tarifa(){
		
	}
	public Tarifa(int idTarifa, String tipoTarifa, double monto) {
		super();
		this.idTarifa = idTarifa;
		this.tipoTarifa = tipoTarifa;
		this.monto = monto;
	}
	public int getIdTarifa() {
		return idTarifa;
	}
	public void setIdTarifa(int idTarifa) {
		this.idTarifa = idTarifa;
	}
	public String getTipoTarifa() {
		return tipoTarifa;
	}
	public void setTipoTarifa(String tipoTarifa) {
		this.tipoTarifa = tipoTarifa;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	
	
}
