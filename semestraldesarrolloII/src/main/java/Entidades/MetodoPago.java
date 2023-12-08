package Entidades;

public class MetodoPago {
	private int idMetodoPago;
	private String nombre, descripcion;
	
	public MetodoPago() {
		
	}
	public MetodoPago(int idMetodoPago, String nombre, String descripcion) {
		super();
		this.idMetodoPago = idMetodoPago;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	public int getIdMetodoPago() {
		return idMetodoPago;
	}
	public void setIdMetodoPago(int idMetodoPago) {
		this.idMetodoPago = idMetodoPago;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
