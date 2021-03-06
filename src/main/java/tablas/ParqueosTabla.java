package tablas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ParqueosTabla {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String vehiculo;
	private String horaIngreso;
	private String horaSalida;
	private int tipoVehiculo;
	private int valorCobrado;
	
	public ParqueosTabla() {

	}

	public String getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(String vehiculo) {
		this.vehiculo = vehiculo;
	}

	public String getHoraIngreso() {
		return horaIngreso;
	}

	public void setHoraIngreso(String horaIngreso) {
		this.horaIngreso = horaIngreso;
	}

	public String getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(String horaSalida) {
		this.horaSalida = horaSalida;
	}

	public int getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(int tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public int getValorCobrado() {
		return valorCobrado;
	}

	public void setValorCobrado(int valorCobrado) {
		this.valorCobrado = valorCobrado;
	}

	
}
