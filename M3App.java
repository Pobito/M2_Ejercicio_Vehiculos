import javax.swing.JOptionPane;

import Clases.Bike;
import Clases.Car;

public class M3App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String vehiculo = JOptionPane.showInputDialog("Que vehiculo quieres generar? (coche/moto)").toLowerCase();
		
		switch (vehiculo) {
			case ("coche"):
				Car coche = new Car();
				break;
			case ("moto"):
				Bike moto = new Bike();

				System.out.println(moto.toString());
				break;
			default:
				System.out.println("Vehiculo mal introducido");
		}

	}

}
