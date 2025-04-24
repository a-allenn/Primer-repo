package wallapop;

import java.time.LocalDate;

public class Envio extends Producto{
	private double peso;

	public Envio(String codigo, String descrp, double preciov, String mail, LocalDate fecha, double peso) {
		super(codigo, descrp, preciov, mail, fecha);
		this.peso = peso;
	}

}
