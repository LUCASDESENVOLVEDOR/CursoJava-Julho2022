package interfaces;

//interface tudo � abstrado por defini��o.
public interface Figura {
	double calcularArea();
	
	String AUTOR = "IMPACTA";
	
	//calcularArea � abstract e � public.
	
	//por padrao toda String em interface � 
	 // static e FINAL.
	
	//metodo default  = m�todo definido na interface, acessivel
	// por todos os objetos de todas as classes que implementarem.
	
	//this = � uma referencia ao objeto da classe que vai implementar.
		
	default String apresentarFigura() {
		
		String resposta = "Classe: " + this.getClass().getName()+
				"\n�rea: " + this.calcularArea();	
		
		return resposta;
	}

	//Criar uma interface chamada Documento que ter� um metodo
	// chamado setNumero que nao ir� retornar nada e ira receber 
	// uma String. 
	
	//e um segundo metodo que ira retornar o numero getNumero()
	
	
	//Criar uma classe DocumentoCPF e implementar Documento
	//com a propriedade cpf.
	
	
	
	
	
}
