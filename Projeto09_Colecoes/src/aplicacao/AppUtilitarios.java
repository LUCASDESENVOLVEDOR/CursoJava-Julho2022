package aplicacao;

import interfaces.Calculo;
import classe.Utilitarios;

public class AppUtilitarios {
	public static void main(String[] args) {
		
		//acessando um metodo estatico atravez de uma interface funcional.
		Calculo calculo = Utilitarios::somar; 		
		double resposta = calculo.calcular(3,7);
		
		System.out.println("resposta " + resposta);
		
		//acessar o metodo de instancia mostrar() da classe automovel
		
		//Operacao04<String,String> acessar o mostrar;
		
		
		
		
		
		
		
		
	}

}
