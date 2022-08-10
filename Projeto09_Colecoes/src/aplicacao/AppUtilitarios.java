package aplicacao;

import interfaces.Calculo;
import interfaces.Operacao04;
import classe.Utilitarios;
import classe.Automovel;

public class AppUtilitarios {
	public static void main(String[] args) {
		
		//acessando um metodo estatico atravez de uma interface funcional.
		Calculo calculo = Utilitarios::somar; 		
		double resposta = calculo.calcular(3,7);
		
		System.out.println("resposta " + resposta);
		
		//acessar o metodo de instancia mostrar() da classe automovel
		//Automovel automovel = new Automovel("Ford","Fiesta",200,"dzz1245");		
		
		//Operacao04<String,String>  op = automovel::mostrar;
		
		
		
		
		
		
		
		
	}

}
