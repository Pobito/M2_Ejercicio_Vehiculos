package Clases;

import Padre.Vehiculo;

public class Bike extends Vehiculo {
	
	// Atributos
	private Rueda delantera;
	private Rueda trasera;
	
	// Constructor
	public Bike () {
		super();
		this.delantera = generarRueda();
		this.trasera = generarRueda();
	}

	// Getters setters
	public Rueda getDelantera() {
		return delantera;
	}

	public void setDelantera(Rueda delantera) {
		this.delantera = delantera;
	}

	public Rueda getTrasera() {
		return trasera;
	}

	public void setTrasera(Rueda trasera) {
		this.trasera = trasera;
	}

	@Override
	public String toString() {
		return "Bike [delantera=" + delantera + ", trasera=" + trasera + ", matricula=" + matricula + ", marca=" + marca
				+ ", color=" + color + "]";
	}

	
	
}
