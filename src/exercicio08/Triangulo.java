package exercicio08;

public class Triangulo implements Figura{
	private double base;
	private double altura;
	
	
	public Triangulo() {
		this(0, 0);
	}

	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public String toString() {
		return "Tri�ngulo de base: " + 
			    this.base + 
			    ", Altura de: " +
			    this.altura +
			    "e �rea: " + 
			    this.calcularArea(); 
	}
	
	public double calcularArea() {
		return (this.base * this.altura) / 2;
	}
}
