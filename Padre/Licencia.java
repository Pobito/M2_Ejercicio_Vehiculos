package Padre;

import javax.swing.JOptionPane;

public class Licencia {
	
	// Atributos
	private int id;
	private String tipo;
	private String nombre;
	private String caducidad;
	
	// Constructor
	public Licencia() {
		this.id = Integer.parseInt(JOptionPane.showInputDialog("Di la ID de la licencia"));
		this.tipo = JOptionPane.showInputDialog("Tipo de licencia");
		this.nombre = JOptionPane.showInputDialog("Nombre");
		this.caducidad = JOptionPane.showInputDialog("Fecha de caducidad (dd/mm/aaaa)");
	}

	// Getters setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCaducidad() {
		return caducidad;
	}

	public void setCaducidad(String caducidad) {
		this.caducidad = caducidad;
	}
	
	

}
