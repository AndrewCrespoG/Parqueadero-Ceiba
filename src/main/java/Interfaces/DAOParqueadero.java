package Interfaces;

import java.util.List;

import tablas.ParqueosTabla;


public interface DAOParqueadero {
	
	public void registrarParqueo(ParqueosTabla pt) throws Exception; 
	public List<ParqueosTabla> listarVehiculosEnParqueados() throws Exception;
	
}
