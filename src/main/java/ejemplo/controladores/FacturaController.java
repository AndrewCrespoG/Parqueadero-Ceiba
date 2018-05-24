package ejemplo.controladores;

import ejemplo.ejemplo.Factura;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class FacturaController {
	
	@RequestMapping("/mostrarFactura")
	public Factura getFactura(){
		//Creando la factura
		Factura factura = new Factura ();
		
		return factura;
	}
	
}
