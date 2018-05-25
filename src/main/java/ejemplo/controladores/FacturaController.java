package ejemplo.controladores;

import ejemplo.ejemplo.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.Calendar;

@RestController
public class FacturaController {
	
	@RequestMapping("/mostrarFactura")
	public Factura getFactura(){
		//Creando la factura
		int tipoDeVehiculo = 0;
		
		Tarifa tarifa = new Tarifa(tipoDeVehiculo);
		
		Calendar entradaVehiculo = Calendar.getInstance();
		entradaVehiculo.set(2018, 00, 21, 05, 00); //Entra el 21 de Enero del 2018
		
		Calendar salidaVehiculo = Calendar.getInstance();
		salidaVehiculo.set(2018, 00, 22, 06, 00); // Sale el 22 de Enero del 2018
		//En teoria pasa 25 Horas el vehiculo en el parqueadero
		
		Factura factura = new Factura ("ABC-123", null , entradaVehiculo, salidaVehiculo, tarifa);
		
		return factura;
	}
	
}
