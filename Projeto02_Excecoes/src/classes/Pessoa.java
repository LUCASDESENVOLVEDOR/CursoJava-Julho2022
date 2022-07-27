package classes;

public class Pessoa {
	
	 private String nome;
	 private int idade;
	 
	 
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		
		//trim() retira os espacos.
		//length() tamanho
		
		if(nome == null || nome.trim().length() == 0)
			throw new IllegalArgumentException("O nome foi fornecido incorretamente"); 
		
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) throws IllegalAccessException {
		
		if(idade < 0 )
			throw new IllegalAccessException("A idade não pode ser negativa");
		
		this.idade = idade;
	}	 	 
	
}
