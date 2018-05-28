package DAO;

import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Interfaces.DAOParqueadero;
import tablas.ParqueosTabla;

public class DAOParqueaderoImp extends Conexion implements DAOParqueadero{

	@Override
	public List<ParqueosTabla> listarVehiculosEnParqueados() throws Exception {
		
		List<ParqueosTabla> listaDeHistorial = new ArrayList();
		
		try {
			this.conectarBD();
			PreparedStatement st = this.conexion.prepareStatement("select * from parqueos");
			ResultSet rs = st.executeQuery();
			
			while(rs.next()) {
				ParqueosTabla pt = new ParqueosTabla();
				pt.setVehiculo(rs.getString("vehiculo"));
				pt.setHoraIngreso(rs.getString("hora_ingreso"));
				pt.setHoraSalida(rs.getString("hora_salida"));
				pt.setTipoVehiculo(rs.getInt("tipo_vehiculo"));
				pt.setValorCobrado(rs.getInt("valor_cobrado"));
				listaDeHistorial.add(pt);
			}
			rs.close();
			st.close();
		}catch (Exception e){
			throw e;
		}finally {
			this.cerrarConexion();
		}
		
		return listaDeHistorial;
	}

	@Override
	public void registrarParqueo(ParqueosTabla pt) throws Exception {
		try {
			this.conectarBD();
			PreparedStatement st = this.conexion.prepareStatement("insert into parqueos values(?, ?, ?, ?, ?)");
			st.setString(1, pt.getVehiculo());
			st.setInt(2, pt.getTipoVehiculo());
			
			st.setString(3, pt.getHoraIngreso());
			
			st.setString(4, pt.getHoraSalida());
			
			st.setInt(5, pt.getValorCobrado());
			st.executeUpdate();
		}catch(Exception e) {
			throw e;
		}finally {
			this.cerrarConexion();;
		}
	}
	
	
}
