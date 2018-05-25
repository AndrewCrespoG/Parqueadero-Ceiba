package ejemplo.ejemplo;

public class Parqueadero {
	
	private String nombreParqueadero;
	private Factura factura;
	
	public Parqueadero(String nombreParqueadero) {
		this.nombreParqueadero = nombreParqueadero;
	}

	public Parqueadero() {
	}

	public String getNombreParqueadero() {
		return nombreParqueadero;
	}

	public void setNombreParqueadero(String nombreParqueadero) {
		this.nombreParqueadero = nombreParqueadero;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}
	
	
}
