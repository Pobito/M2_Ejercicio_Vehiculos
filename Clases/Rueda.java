package Clases;

public class Rueda {
	
	// Atributos
	private String marca;
	private double diametro;
	
	// Getters setters
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getDiametro() {
		return diametro;
	}
	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}
	
	@Override
	public String toString() {
		return "Rueda [marca=" + marca + ", diametro=" + diametro + "]";
	}
	// Constructores
	public Rueda(String marca, double diametro) {
		super();
		this.marca = marca;
		this.diametro = diametro;
	}
	
	
	
}
