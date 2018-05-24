package ejemplo.ejemplo;

import java.util.Calendar;

public class Factura {
	
	private double valor;
	private String placaVehiculo;
	private Calendar ingresoVehiculo;
	private Calendar salidaVehiculo;
	private Tarifa tarifa;
	
	public Factura() {//Constructor sin parámetros
	}

	public Factura(double valor, String placaVehiculo, Calendar ingresoVehiculo, Calendar salidaVehiculo, Tarifa tarifa) {
		this.valor = valor;
		this.placaVehiculo = placaVehiculo;
		this.ingresoVehiculo = ingresoVehiculo;
		this.salidaVehiculo = salidaVehiculo;
		this.tarifa = tarifa;
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
	
	public Tarifa getTarifa() {
		return tarifa;
	}
	
	public void setTarifa(Tarifa tarifa) {
		this.tarifa = tarifa;
	}
	
}
