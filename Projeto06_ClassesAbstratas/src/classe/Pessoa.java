package classe;

public abstract class Pessoa {
	
	private String nome;
	private int idade;
	
	
	public Pessoa() {};	
	
	public Pessoa(String nome, int idade) {
		super();	
		this.setNome(nome);
		this.setIdade(idade);
	}
	
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













