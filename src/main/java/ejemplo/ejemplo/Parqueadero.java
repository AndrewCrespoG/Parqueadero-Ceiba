package ejemplo.ejemplo;

<<<<<<< HEAD
=======
import java.util.Calendar;

>>>>>>> 9f31ae170384c4d56fb6d9a8eb7261575b4a70f5
public class Parqueadero {
	
	private String nombreParqueadero;
	private Factura factura;
	
<<<<<<< HEAD
=======
	private static final boolean MENSAJE_INGRESO_INVALIDO = false;
	private static final boolean MENSAJE_INGRESO_EXITOSO = true;
	
>>>>>>> 9f31ae170384c4d56fb6d9a8eb7261575b4a70f5
	public Parqueadero(String nombreParqueadero) {
		this.nombreParqueadero = nombreParqueadero;
	}

	public Parqueadero() {
	}

<<<<<<< HEAD
=======
	public boolean intentarIngresarVehiculoAlParqueadero(Vehiculo vehiculo, Calendar fechaIngreso) {
		//Si la placa comienza por A
		
		if (!vehiculo.getPlaca().startsWith("A")) {//Si la placa no comienza por A ingresa
			ingresarVehiculoAlParqueadero(vehiculo, fechaIngreso);
			System.out.println("Entra porque no comienza por A");
			return MENSAJE_INGRESO_EXITOSO;
		}else if(vehiculo.getPlaca().startsWith("A") &&
				(fechaIngreso.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY ||
				fechaIngreso.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY)) { //Si comienza por A y es domingo o lunes ingresa
			ingresarVehiculoAlParqueadero(vehiculo, fechaIngreso);
			System.out.println("Entra porque comienza por A y es lunes o domingo");
			return MENSAJE_INGRESO_EXITOSO;
		}else if(vehiculo.getPlaca().startsWith("A") &&
				!(fechaIngreso.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY ||
				fechaIngreso.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY)) {//Empieza por A pero no es lunes ni domingo no entra
			System.out.println("No entra porque comienza por A y no es lunes o domingo");
			return MENSAJE_INGRESO_INVALIDO;
		}
		
		return false;
	}
	
	public void ingresarVehiculoAlParqueadero(Vehiculo vehiculo, Calendar fechaIngreso) {
		//Consulta si se puede hacer la insercion (si el parqueadero no esta lleno)
		//Ejecuta la inserción en la base de datos
	}
	
	public String primeraLetraDeCadena(String cadena) {
		return Character.toString(cadena.charAt(0));
	}
	
>>>>>>> 9f31ae170384c4d56fb6d9a8eb7261575b4a70f5
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
	
<<<<<<< HEAD
	
=======
>>>>>>> 9f31ae170384c4d56fb6d9a8eb7261575b4a70f5
}
