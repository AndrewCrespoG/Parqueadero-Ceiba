package ejemplo.ejemplo;

import java.util.Calendar;

public class Factura {
	
	private double Valor;
	private String PlacaVehiculo;
	private Calendar IngresoVehiculo;
	private Calendar SalidaVehiculo;
	
	
	public Factura() {//Constructor sin parámetros
	}
	
	public Factura(double valor, String placaVehiculo, Calendar ingresoVehiculo, Calendar salidaVehiculo) { //Constructor con parámetros
		super();
		this.Valor = valor;
		this.PlacaVehiculo = placaVehiculo;
		this.IngresoVehiculo = ingresoVehiculo;
		this.SalidaVehiculo = salidaVehiculo;
	}

	public double getValor() {
		return Valor;
	}

	public void setValor(double valor) {
		Valor = valor;
	}

	public String getPlacaVehiculo() {
		return PlacaVehiculo;
	}

	public void setPlacaVehiculo(String placaVehiculo) {
		PlacaVehiculo = placaVehiculo;
	}

	public Calendar getIngresoVehiculo() {
		return IngresoVehiculo;
	}

	public void setIngresoVehiculo(Calendar ingresoVehiculo) {
		IngresoVehiculo = ingresoVehiculo;
	}

	public Calendar getSalidaVehiculo() {
		return SalidaVehiculo;
	}

	public void setSalidaVehiculo(Calendar salidaVehiculo) {
		SalidaVehiculo = salidaVehiculo;
	}
	
	
	
	
}
