package classe;

import interfaces.Documento;

public abstract class Pessoa {
	
	private String nome;
	private int idade;
	
	private Documento documento;
	
	
	public Pessoa() {};	
	
	public Pessoa(String nome, int idade, Documento documento) {
		super();	
		this.setNome(nome);
		this.setIdade(idade);
		this.setDocumento(documento);
	}
	
	public String mostrar() {		
		return "\nNome: " + this.getNome() + 
				"\nIdade: "+ this.getIdade() +
				
				(this.getDocumento() instanceof DocumentoCpf 
						? "\nCPF:" : "\nCNPJ: ")
				+				
				 this.getDocumento().getNumero();
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

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}
	
	

}













