package ejemplo.ejemplo;

import java.sql.Date;
import java.util.Calendar;

import DAO.DAOParqueaderoImp;
import Interfaces.DAOParqueadero;
import tablas.ParqueosTabla;

public class ProbandoSQL {

	public static void main(String[] args) {
		
		ParqueosTabla pt = new ParqueosTabla();
		pt.setVehiculo("CDE-345");
		
		Date horaIngreso = (Date) Calendar.getInstance().getTime();
		
		Date horaSalida = (Date) Calendar.getInstance().getTime();
		
		
		pt.setHoraSalida(horaSalida.toString());
		
		pt.setHoraIngreso(horaIngreso.toString());
		
		pt.setTipoVehiculo(1);
		pt.setValorCobrado(4000);
		try {
			DAOParqueadero dao = new DAOParqueaderoImp();
			dao.registrarParqueo(pt);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
