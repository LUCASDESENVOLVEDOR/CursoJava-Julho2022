package classe;

import interfaces.Figura;

public class Circulo  implements Figura {
	
	private double raio;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		//Area = PI * raio ao quadrado.
		return Math.PI * Math.pow(raio, 2);
	};
	

}
