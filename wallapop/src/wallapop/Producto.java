package wallapop;

import java.time.LocalDate;

public class Producto {
	private String codigo;
	private String descrp;
	private double preciov; 
	private String mail;
	LocalDate fecha;
	
	
	public Producto(String codigo, String descrp, double preciov, String mail, LocalDate fecha) {
		super();
		this.codigo = codigo;
		this.descrp = descrp;
		this.preciov = preciov;
		this.mail = mail;
		this.fecha = fecha;
	}
	
	
}
