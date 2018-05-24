package ejemplo.pruebas;

import static org.junit.Assert.assertNotNull;

import java.util.Calendar;

import org.junit.Test;
import ejemplo.ejemplo.Factura;

public class FacturaTest {

	@Test
	public void crearFacturaTest(){
		//Arrange
		
		String placaVehiculo = "ABC-123";
		double valor = 5800.0;
		Calendar ingresoVehiculo = null;
		Calendar salidaVehiculo = Calendar.getInstance();

		//Act
		
		Factura factura = new Factura (valor, placaVehiculo, ingresoVehiculo, salidaVehiculo);
		
		//Assert
		assertNotNull(factura);
	} 

}
