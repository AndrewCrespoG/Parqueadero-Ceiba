package ejemplo.ejemplo;

public class Tarifa {
	
	//Tabla de tarifas
	private static final double VALOR_DIA_AUTOMOVIL = 8000;
	private static final double VALOR_HORA_AUTOMOVIL = 1000;
	private static final double VALOR_DIA_MOTO = 4000;
	private static final double VALOR_HORA_MOTO = 500;
	private static final double VALOR_ADICIONAL_MOTO_POR_CILINDRAJE = 2000;
	private static final int ES_MOTOCICLETA = 1;
	private static final int ES_AUTOMOVIL = 0;
	
	//Fin tabla tarifas
	
	private double valorHora;
	private double valorDia; 
	private int tipoVehiculo;
	private int cilindraje;
	private double valorAdicionalMotoCilindraje;
	
	public Tarifa() {
		
	}
	
	public Tarifa(int tipoVehiculo) {
		
		this.valorDia = calcularValorDia(tipoVehiculo);
		this.valorHora = calcularValorHora(tipoVehiculo);
		this.valorAdicionalMotoCilindraje = VALOR_ADICIONAL_MOTO_POR_CILINDRAJE;
		
	}
	
	private double calcularValorDia(int tipoVehiculo){
		if (tipoVehiculo == ES_AUTOMOVIL) {
			valorDia = VALOR_DIA_AUTOMOVIL;
		} else if (tipoVehiculo == ES_MOTOCICLETA) { //Es Motocicleta
			this.valorDia = VALOR_DIA_MOTO;
		}
		return valorDia;
	}
	
	private double calcularValorHora(int tipoVehiculo){
		if (tipoVehiculo == 0) {//Es Automovil
			valorHora = VALOR_HORA_AUTOMOVIL;
		} else if (tipoVehiculo == 1) { //Es Motocicleta
			this.valorHora = VALOR_DIA_MOTO;
		}
		return valorHora;
	}
	


	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public double getValorDia() {
		return valorDia;
	}

	public void setValorDia(double valorDia) {
		this.valorDia = valorDia;
	}

	public int getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(int tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public int getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}

	public double getValorAdicionalMotoCilindraje() {
		return valorAdicionalMotoCilindraje;
	}

	public void setValorAdicionalMotoCilindraje(double valorAdicionalMotoCilindraje) {
		this.valorAdicionalMotoCilindraje = valorAdicionalMotoCilindraje;
	}
	
	
}