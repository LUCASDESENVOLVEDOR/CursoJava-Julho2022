package aplicacao;

public class AppExercicio04 {
	
	public static void recebeValor(int valor) {
		
		if(valor <0 || valor > 100)
			throw new IllegalArgumentException("Numero inválido");
		else
			System.out.println("Número OK");		
	}
	
	
	public static void main(String[] args) {
		
		//4 - Escreva uma função que receba um parametro do 
		//tipo inteiro entre 0 e 100, caso o valor informado for fora do range,
		//retorne uma excecao de IllegalArgumentException
		
		recebeValor(20);
		recebeValor(-40);
		
		
	}
	
	
	
	

}
