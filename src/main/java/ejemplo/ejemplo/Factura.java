package ejemplo.ejemplo;

import java.util.Calendar;

public class Factura {
	
	private double valor;
	private String placaVehiculo;
	private Calendar ingresoVehiculo;
	private Calendar salidaVehiculo;
	
	
	public Factura() {//Constructor sin par�metros
	}

	public Factura(double valor, String placaVehiculo, Calendar ingresoVehiculo, Calendar salidaVehiculo) {
		this.valor = valor;
		this.placaVehiculo = placaVehiculo;
		this.ingresoVehiculo = ingresoVehiculo;
		this.salidaVehiculo = salidaVehiculo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getPlacaVehiculo() {
		return placaVehiculo;
	}

	public void setPlacaVehiculo(String placaVehiculo) {
		this.placaVehiculo = placaVehiculo;
	}

	public Calendar getIngresoVehiculo() {
		return ingresoVehiculo;
	}

	public void setIngresoVehiculo(Calendar ingresoVehiculo) {
		this.ingresoVehiculo = ingresoVehiculo;
	}

	public Calendar getSalidaVehiculo() {
		return salidaVehiculo;
	}

	public void setSalidaVehiculo(Calendar salidaVehiculo) {
		this.salidaVehiculo = salidaVehiculo;
	}
	
	
	
}
