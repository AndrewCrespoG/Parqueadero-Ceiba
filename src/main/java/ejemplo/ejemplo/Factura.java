package ejemplo.ejemplo;

import java.util.Calendar;

public class Factura {
	
	private double valor;
	private String placaVehiculo;
	private Calendar ingresoVehiculo;
	private Calendar salidaVehiculo;
	private Tarifa tarifa;
	private Vehiculo vehiculo;
	
	public Factura() {
	}
	
	public double calcularValorFactura() {
		
		int numeroDeHoras = calcularNumeroDeHoras(this.getIngresoVehiculo(), this.getSalidaVehiculo());
		
		int diasParaFacturar = 0;
		int horasParaFacturar = 0;
		double valorDiaParaFacturar = 0;
		double valorHoraParaFacturar = 0;
		
		while(numeroDeHoras > 0) {
			if (numeroDeHoras >= 9 && numeroDeHoras >= 24) {
				System.out.println("Entra numeroDeHoras >= 9 && numeroDeHoras >= 24");
				diasParaFacturar ++;
				numeroDeHoras -= 24;
			}else if(numeroDeHoras >= 9 && numeroDeHoras < 24) {
				System.out.println("Entra numeroDeHoras >= 9 && numeroDeHoras < 24");
				diasParaFacturar ++;
				numeroDeHoras = 0;
			}else if(numeroDeHoras < 9) {
				System.out.println("Entra numeroDeHoras < 9");
				horasParaFacturar = numeroDeHoras;
				numeroDeHoras = 0;
			}
			
		}
		
		valorDiaParaFacturar = (this.getTarifa().getValorDia() * diasParaFacturar);
		System.out.println("Valor dias para facturar " + valorDiaParaFacturar);
		valorHoraParaFacturar = (this.getTarifa().getValorHora() * horasParaFacturar);
		System.out.println("Valor horas por facturar " + valorHoraParaFacturar);
		System.out.println("Valor adicional por cilindraje " + this.getTarifa().getValorAdicionalMotoCilindraje());
		
		System.out.println("Total: " + (valorDiaParaFacturar + valorHoraParaFacturar + this.getTarifa().getValorAdicionalMotoCilindraje()));
		
		return (valorDiaParaFacturar + valorHoraParaFacturar + this.getTarifa().getValorAdicionalMotoCilindraje());
	}
	
	public int calcularNumeroDeHoras(Calendar entradaVehiculo, Calendar salidaVehiculo) {
		return (int) ((salidaVehiculo.getTimeInMillis() - entradaVehiculo.getTimeInMillis())/1000/60/60);
	}

	public Factura(String placaVehiculo, Vehiculo vehiculo, Calendar ingresoVehiculo, Calendar salidaVehiculo, Tarifa tarifa) {
		this.placaVehiculo = placaVehiculo;
		this.vehiculo = vehiculo;
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

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
}
