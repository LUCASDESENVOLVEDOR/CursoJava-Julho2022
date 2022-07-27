package aplicacao;

public class AppExercicio02 {
	public static void main(String[] args) {
		
		//2 - Escreva um  programa em java que consulte uma classe 
		//pelo nome, como a classe PESSOA.
		
		//Adicione um tratamento para caso a classe nao exista 
		//informar ao usuario.
		
		try {			
			  Class.forName("classes.Pessoa");	
			
		}
		catch (ClassNotFoundException e) {
			System.out.println("A classe não foi localizada.");			
		}		
	}

}
