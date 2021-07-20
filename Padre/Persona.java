package Padre;

import javax.swing.JOptionPane;

public abstract class Persona {
	
	// Atributos
	protected String nombre;
	protected String apellido;
	protected String nacimiento;
	protected Licencia licencia;
	
	// Constructor
	public Persona() {
		this.nombre = JOptionPane.showInputDialog("Di tu nombre");
		this.apellido = JOptionPane.showInputDialog("Di tu apellido");
		this.nacimiento = JOptionPane.showInputDialog("Fecha de nacimiento (dd/mm/aaaa)");
		this.licencia = new Licencia();
	}

	// Getters setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(String nacimiento) {
		this.nacimiento = nacimiento;
	}

	public Licencia getLicencia() {
		return licencia;
	}

	public void setLicencia(Licencia licencia) {
		this.licencia = licencia;
	}
	// Este getters lo he creado yo para que me devuelva el tipo de licencia
	public String getTipo() {
		return licencia.getTipo();
	}

	
	
}
