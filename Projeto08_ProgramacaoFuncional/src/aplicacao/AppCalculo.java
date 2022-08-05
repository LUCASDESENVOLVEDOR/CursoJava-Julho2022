package aplicacao;

import interfaces.Calculo;

public class AppCalculo {
	public static void main(String[] args) {
		
		Calculo c1 = (double x, double y) -> x + 2 * y;
		
		double resultado = c1.calcular(2, 7);
		
		System.out.println("Resultado: " + resultado);
		
		
		
	}

}
