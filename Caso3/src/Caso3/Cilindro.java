package Caso3;

public class Cilindro {
	private double radio, altura;

	public Cilindro(double radio, double altura) {
		this.radio = radio;
		this.altura = altura;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double Volumen() {
		return 3.14*radio*radio*altura;
	}

}
