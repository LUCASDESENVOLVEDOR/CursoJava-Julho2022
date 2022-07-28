package aplicacao;

import classes.ExcecaoIdade;

public class AppPessoa02 {
 
	public static void validaIdade(int idade) throws ExcecaoIdade {
		
		if(idade < 20)
			throw new ExcecaoIdade("A idade: " + idade + " n�o � v�lida");
			
		else {
			System.out.println("Idade v�lida");
		}
	}
	
	public static void main(String[] args) {
	  
		try {
			validaIdade(25);
			validaIdade(19);
			validaIdade(30);
			validaIdade(40);
			validaIdade(50);
			
		}
		catch (ExcecaoIdade e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
