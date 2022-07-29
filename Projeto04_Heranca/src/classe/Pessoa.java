package classe;

public class Pessoa {
	
	private String nome;
	private int idade;
	
	
	public String mostrar() {		
		return "\nNome: " + this.getNome() + 
				"\nIdade: "+ this.getIdade();		
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	

}
