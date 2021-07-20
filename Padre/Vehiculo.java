package Padre;

import javax.swing.JOptionPane;

import Clases.Rueda;

public abstract class Vehiculo {
	
	// Atributos
	protected String matricula;
	protected String marca;
	protected String color;
	
	// Getters setters
	public String getmatricula() {
		return matricula;
	}
	public void setmatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	// Constructores
	public Vehiculo () {
	this.matricula = matricula();
	this.marca = marca();
	this.color = color();
	}
	
	// Metodos
	public Rueda generarRueda() {
		String marca;
		double diametro;
		
		marca = JOptionPane.showInputDialog("Di la marca de la rueda");
		
		do {
            String diametro_usuario = JOptionPane.showInputDialog("Di el diametro de la rueda");
            diametro=Double.parseDouble(diametro_usuario);
        } while(diametro < 0.4 || diametro > 4);
		
		Rueda rueda = new Rueda (marca, diametro);
		
		return rueda;
	}
	
	// Para comprovar que la matricula sea del formato que queremos
	private String matricula() {
		String matricula ="", letras = "";
		int num;
		
		// Pedimos los numeros, los parseamos y dividimos entre 1000, si da 0 ha puesto menos de 4 cifras
		// Si da mas grande a 10 ha puesto mas de 4 cifras
		do {
			matricula = JOptionPane.showInputDialog("Di los numeros de la matricula");
			num = Integer.parseInt(matricula);
		} while (num / 1000 <= 0 || num / 1000 > 10);
		
		do {
			letras = JOptionPane.showInputDialog("Di las letras de la matricula").toUpperCase();
		} while (letras.length() != 2 && letras.length() != 3);
		
		matricula += letras;
		
		return matricula;
	}
	
	private String marca() {
		return JOptionPane.showInputDialog("Di la marca");
	}
	private String color() {
		return JOptionPane.showInputDialog("Di el color");
	}
	
}
