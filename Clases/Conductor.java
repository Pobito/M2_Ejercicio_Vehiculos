package Clases;

import javax.swing.JOptionPane;

import Padre.Persona;

public class Conductor extends Persona {
	
	// Atributos
	private boolean garaje;
	private boolean seguro;
	
	// Constructor
	public Conductor () {
		super();
		this.garaje = Boolean.parseBoolean(JOptionPane.showInputDialog("Tienes garaje? (true/false)"));
		this.seguro = Boolean.parseBoolean(JOptionPane.showInputDialog("Tienes seguro? (true/false)"));
	}

	// Getters setters
	public boolean isGaraje() {
		return garaje;
	}

	public void setGaraje(boolean garaje) {
		this.garaje = garaje;
	}

	public boolean isSeguro() {
		return seguro;
	}

	public void setSeguro(boolean seguro) {
		this.seguro = seguro;
	}

	
}
