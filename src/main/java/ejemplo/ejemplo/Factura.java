package ejemplo.ejemplo;

import static org.assertj.core.api.Assertions.assertThatIllegalStateException;

import java.util.Calendar;

public class Factura {
	
	private double valorFactura;
	private Calendar ingresoVehiculo;
	private Calendar salidaVehiculo;
	private Tarifa tarifa;
	private Vehiculo vehiculo;
	
	public Factura() {
	}
	
	public double calcularValorFactura() {
		int horasPorCalcular = calcularNumeroDeHorasEntreDosFechas(this.ingresoVehiculo, this.salidaVehiculo);
		
		int diasPorFacturar = calcularDiasDesde(horasPorCalcular);
		int horasPorFacturar = calcularHorasSobrantesDesde(horasPorCalcular);
		
		double total;
		total = (diasPorFacturar * this.tarifa.getValorPorDia()) +
				(horasPorFacturar * this.tarifa.getValorPorHora()) +
				this.tarifa.getValorAdicionalAMotoPorCilindraje();
		
		return total;
	}
	
	public int calcularHorasSobrantesDesde(int horas) { // Calcula las horas sobrantes
		while (horas >= 24) {
			horas -= 24;
		}
		return horas;
	}
	
	public int calcularDiasDesde(int horas) { // Calcular dias
		if (horas >= 9 && horas > 24) {
			return (horas / 24);
		}else if(horas >= 9 && horas <= 24) {
			return 1;
		}
		return 0;
	}
	
	public int calcularNumeroDeHorasEntreDosFechas(Calendar antes, Calendar despues) {
		int horas = (int) ((despues.getTimeInMillis() - antes.getTimeInMillis())/1000/60/60);
		return (horas < 1) ? (1) : (horas);
	}

	public Factura(Vehiculo vehiculo, Calendar ingresoVehiculo, Calendar salidaVehiculo, Tarifa tarifa) {
		this.vehiculo = vehiculo;
		this.ingresoVehiculo = ingresoVehiculo;
		this.salidaVehiculo = salidaVehiculo;
		this.tarifa = tarifa;	
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
