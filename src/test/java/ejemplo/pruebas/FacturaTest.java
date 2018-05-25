package ejemplo.pruebas;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Assert;
import org.junit.Test;
import ejemplo.ejemplo.*;

public class FacturaTest {
	
	/*@Test
	public void calcularValorFacturaTest() {
		//Assert
		//Propiedades de vehiculo (automovil)
		
		int cilindraje = 600;
		String placa = "ABC-123";
		String propietario = "Andrew Crespo";
		int tipoVehiculo = 0;
		
		Vehiculo vehiculo = new Vehiculo(cilindraje, placa, propietario, tipoVehiculo);
		
		Tarifa tarifa = new Tarifa (vehiculo);
		
		//La factura
		Calendar fechaIngreso; //Ayer
		Calendar fechaSalida; // Hoy (25 hrs)
		
		Factura factura = new Factura(vehiculo, null, null, tarifa);
	}*/
	
	@Test
	public void calcularNumeroDeHorasEntreDosFechasTest(){
		//Assert
		Calendar hoy = Calendar.getInstance();
		Calendar manana = Calendar.getInstance();
		manana.add(Calendar.DAY_OF_MONTH, 2);
		Factura factura = new Factura(null, hoy, manana, null);
		int esperado = 48;
		
		//Act
		int actual = factura.calcularNumeroDeHorasEntreDosFechas(hoy, manana);
		
		//Assert
		Assert.assertEquals(esperado, actual);
	}

	@Test
	public void calcularDiasDesdeTest() {
		//Arrange
		int horas = 25;
		int esperado = 1;
		Factura factura = new Factura();
		
		//Act
		int actual = factura.calcularDiasDesde(horas);
		
		//Assert
		Assert.assertEquals(esperado, actual);
	}
	
	@Test
	public void calcularHorasSobrantesDesdeTest() {
		//Arrange
		Factura factura = new Factura ();
		int horas = 49;
		int esperado = 1;
		
		//Act
		int actual = factura.calcularHorasSobrantesDesde(horas);
		
		//Assert
		Assert.assertEquals(esperado, actual);
	}
}
