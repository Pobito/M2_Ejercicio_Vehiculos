import java.util.ArrayList;

import javax.swing.JOptionPane;

import Clases.Bike;
import Clases.Camion;
import Clases.Car;
import Clases.Conductor;
import Clases.Titular;

public class M3App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Titular> titular = new ArrayList<>();
		ArrayList<Car> coche = new ArrayList<>();
		ArrayList<Bike> moto = new ArrayList<>();
		ArrayList<Camion> camion = new ArrayList<>();
		
		// Constantes
		final String COCHE = "coche", MOTO = "moto", CAMION = "camion", L_COCHE = "B", L_MOTO = "A", L_CAMION = "C";
		String tLicencia = "", tVehiculo = "";
		
		
		do {
			
			Titular titular1 = new Titular();
			
			String vehiculo = JOptionPane.showInputDialog("Que vehiculo quieres generar? (coche/moto/camion)").toLowerCase();
			
			if (comprobarLicencia(vehiculo, titular1, COCHE, L_COCHE)) {
				coche.add(new Car());
				tLicencia = L_COCHE;
				tVehiculo = COCHE;
				System.out.println(coche.toString());			
			}
			else if (comprobarLicencia(vehiculo, titular1, MOTO, L_MOTO)) {
				moto.add(new Bike());
				tLicencia = L_MOTO;
				tVehiculo = MOTO;
				System.out.println(moto.toString());
			}
			else if (comprobarLicencia(vehiculo, titular1, CAMION, L_CAMION)) {
				camion.add(new Camion());
				tLicencia = L_CAMION;
				tVehiculo = CAMION;
				System.out.println(camion.toString());
			}
			else {
				System.out.println("No tienes la licencia adecuada");
			}

			titular.add(titular1);
			
			if (JOptionPane.showInputDialog("El titular sera el conductor? (si/no)").toLowerCase().equals("no")) {
				Conductor conductor1 = new Conductor();
				if (comprobarLicencia(vehiculo, conductor1, tVehiculo, tLicencia)) {
					System.out.println("COMPLETED");
				}
				else {
					System.out.println("No tiene la licencia adecuada");
				}
			}
			
		} while (Boolean.parseBoolean(JOptionPane.showInputDialog("Quieres generar mas? (true/false)")));
		
		
	}
	
	public static boolean comprobarLicencia(String vehiculo, Titular titular1, String tipo, String licencia) {
		return vehiculo.equals(tipo) && titular1.getTipo().equals(licencia);
	}
	public static boolean comprobarLicencia(String vehiculo, Conductor conductor1, String tipo, String licencia) {
		return vehiculo.equals(tipo) && conductor1.getTipo().equals(licencia);
	}

}
