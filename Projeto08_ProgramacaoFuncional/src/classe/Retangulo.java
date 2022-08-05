package classe;

import interfaces.Figura;

public class Retangulo implements Figura {
	
	private double base;
	private double altura;
	
	
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
	
	//a sobreescrita é obrigatória	
	@Override
	public double calcularArea() {		 
		//Area = base * altura.		
		return this.getBase() * this.getAltura(); 
	}

}


//Criar classe Circulo herdar de Figura com uma propriedade
 // raio e realizar o Override de CalcularArea()











