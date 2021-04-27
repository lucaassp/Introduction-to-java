package exercicio08;

public class Quadrado implements Figura{
	private double lado;
	
	public Quadrado() {
		this.lado = 0;
	}
	
	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	public String toString() {
		return "Quadrado de lado: " + 
			    this.lado + 
			    "e área: " + 
			    calcularArea(); 
	}
	
	public double calcularArea() {
		return lado * lado;
	}
}
