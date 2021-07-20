import javax.swing.JOptionPane;

import Clases.Bike;
import Clases.Camion;
import Clases.Car;
import Clases.Conductor;
import Clases.Titular;

public class M3App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Titular titular1 = new Titular();
		
		// Constantes
		final String COCHE = "coche", MOTO = "moto", CAMION = "camion", L_COCHE = "B", L_MOTO = "A", L_CAMION = "C";
		String tLicencia = "", tVehiculo = "";
		
		String vehiculo = JOptionPane.showInputDialog("Que vehiculo quieres generar? (coche/moto/camion)").toLowerCase();
		
		if (comprobarLicencia(vehiculo, titular1, COCHE, L_COCHE)) {
			Car coche = new Car();
			tLicencia = L_COCHE;
			tVehiculo = COCHE;
			System.out.println(coche.toString());			
		}
		else if (comprobarLicencia(vehiculo, titular1, MOTO, L_MOTO)) {
			Bike moto = new Bike();
			tLicencia = L_MOTO;
			tVehiculo = MOTO;
			System.out.println(moto.toString());
		}
		else if (comprobarLicencia(vehiculo, titular1, CAMION, L_CAMION)) {
			Camion camion = new Camion();
			tLicencia = L_CAMION;
			tVehiculo = CAMION;
			System.out.println(camion.toString());
		}
		else {
			System.out.println("No tienes la licencia adecuada");
		}

		if (JOptionPane.showInputDialog("El titular sera el conductor? (si/no)").toLowerCase().equals("no")) {
			Conductor conductor1 = new Conductor();
			if (comprobarLicencia(vehiculo, conductor1, tVehiculo, tLicencia)) {
				System.out.println("COMPLETED");
			}
			else {
				System.out.println("No tiene la licencia adecuada");
			}
		}
		
	}
	
	public static boolean comprobarLicencia(String vehiculo, Titular titular1, String tipo, String licencia) {
		return vehiculo.equals(tipo) && titular1.getTipo().equals(licencia);
	}
	public static boolean comprobarLicencia(String vehiculo, Conductor conductor1, String tipo, String licencia) {
		return vehiculo.equals(tipo) && conductor1.getTipo().equals(licencia);
	}

}
