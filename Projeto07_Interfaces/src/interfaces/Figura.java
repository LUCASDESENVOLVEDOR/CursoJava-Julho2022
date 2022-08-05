package interfaces;

//interface tudo é abstrado por definição.
public interface Figura {
	double calcularArea();
	
	String AUTOR = "IMPACTA";
	
	//calcularArea é abstract e é public.
	
	//por padrao toda String em interface é 
	 // static e FINAL.
	
	//metodo default  = método definido na interface, acessivel
	// por todos os objetos de todas as classes que implementarem.
	
	//this = é uma referencia ao objeto da classe que vai implementar.
		
	default String apresentarFigura() {
		
		String resposta = "Classe: " + this.getClass().getName()+
				"\nÁrea: " + this.calcularArea();	
		
		return resposta;
	}

	//Criar uma interface chamada Documento que terá um metodo
	// chamado setNumero que nao irá retornar nada e ira receber 
	// uma String. 
	
	//e um segundo metodo que ira retornar o numero getNumero()
	
	
	//Criar uma classe DocumentoCPF e implementar Documento
	//com a propriedade cpf.
	
	
	
	
	
}
