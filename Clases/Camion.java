package Clases;

import java.util.Arrays;

import Padre.Vehiculo;

public class Camion extends Vehiculo {

	// Atributos
	private Rueda[] delantera = new Rueda[4]; // Mis camiones tendran 4 ruedas delanteras y 2 traseras
	private Rueda[] trasera = new Rueda[2];
	
	// Constructor
	public Camion () {
		super();
		this.delantera[0] = generarRueda();
		this.delantera[1] = delantera[0];
		this.delantera[2] = delantera[0];
		this.delantera[3] = delantera[0];
		this.trasera[0] = generarRueda();
		this.trasera[1] = trasera[0];
	}

	// Getters setters
	public Rueda[] getDelantera() {
		return delantera;
	}

	public void setDelantera(Rueda[] delantera) {
		this.delantera = delantera;
	}

	public Rueda[] getTrasera() {
		return trasera;
	}

	public void setTrasera(Rueda[] trasera) {
		this.trasera = trasera;
	}

	@Override
	public String toString() {
		return "Camion [delantera=" + Arrays.toString(delantera) + ", trasera=" + Arrays.toString(trasera)
				+ ", matricula=" + matricula + ", marca=" + marca + ", color=" + color + "]";
	}
	
	
}
