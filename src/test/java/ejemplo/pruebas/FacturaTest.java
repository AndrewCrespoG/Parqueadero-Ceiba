package ejemplo.pruebas;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Assert;
import org.junit.Test;
import ejemplo.ejemplo.Factura;
import ejemplo.ejemplo.Tarifa;
import ejemplo.ejemplo.Vehiculo;

public class FacturaTest {

	@Test
	public void crearFacturaTest(){
		//Arrange
		
		String placaVehiculo = "";
		Calendar ingresoVehiculo = null;
		Calendar salidaVehiculo = null;
		Vehiculo vehiculo = null;
		Tarifa tarifa = new Tarifa();

		//Act
		
		Factura factura = new Factura (placaVehiculo, vehiculo, ingresoVehiculo, salidaVehiculo, tarifa);
		
		//Assert
		assertNotNull(factura);
	} 

	
	@Test
	public void calcularNumeroDeHorasTest() {
		//Arrange
		Calendar hoy = Calendar.getInstance();
		hoy.set(2018, 00, 22, 12, 00, 00);
		Calendar ayer = Calendar.getInstance();
		ayer.set(2018, 00, 21, 00, 00, 00);
		
		Factura factura = new Factura(null, null, ayer, hoy, null);
		int esperado = 36;

		//Act
		int diferencia = factura.calcularNumeroDeHoras(ayer, hoy);
		//Assert
		Assert.assertEquals(esperado, diferencia);
		
	}
	
	@Test
	public void calcularValorFacturaTest() {
		//Arrange
		
		String placaVehiculo = "ABC-123";
		String propietario = "Andrew Crespo";
		int tipoVehiculo = 0;
		int cilindraje = 350;
		
		Vehiculo vehiculo = new Vehiculo (cilindraje, placaVehiculo, propietario, tipoVehiculo);
		
		Calendar ingresoVehiculo = Calendar.getInstance();
		ingresoVehiculo.add(Calendar.DAY_OF_MONTH, -1);
		ingresoVehiculo.add(Calendar.HOUR, -1);
		
		Calendar salidaVehiculo = Calendar.getInstance();
		Tarifa tarifa = new Tarifa(0);
		
		Factura factura = new Factura(placaVehiculo, vehiculo, ingresoVehiculo, salidaVehiculo, tarifa);
		
		//Act
		factura.calcularValorFactura();
		
		//Assert
		
		

		
	}
}
