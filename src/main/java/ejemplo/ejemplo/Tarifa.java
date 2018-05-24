package ejemplo.ejemplo;

public class Tarifa {
	
	private int valorHora;
	private int tipoVehiculo;
	private int cilindraje;
	
	public Tarifa(int valorHora, int tipoVehiculo, int cilindraje) {
		this.valorHora = valorHora;
		this.tipoVehiculo = tipoVehiculo;
		this.cilindraje = cilindraje;
	}
	
	public Tarifa() {
	}
	
	public int getValorHora() {
		return valorHora;
	}
	
	public void setValorHora(int valorHora) {
		this.valorHora = valorHora;
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
	
	
	
}