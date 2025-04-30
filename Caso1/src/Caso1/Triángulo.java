package Caso1;

public class Triángulo {
	
	private double base,altura;

	public Triángulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double Area() {
		return base*altura/2;
	}
	
}
