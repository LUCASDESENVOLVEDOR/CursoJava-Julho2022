package classe;

import interfaces.Documento;

public class Aluno extends Pessoa {
	
	private int matricula;
	private Curso curso;
		
	
	public Aluno(String nome, int idade,Documento documento, int matricula, Curso curso) {
		super(nome,idade,documento);
		this.setMatricula(matricula);
		this.setCurso(curso);
	}
	
	public Aluno() {};	
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	public String mostrar() {
		
		return super.mostrar() +
				"\nMatr�cula: " + this.getMatricula() + 
		         ((this.getCurso() == null) ? "\nNenhum curso atribuido" :
		        	 "\n\nDados do Curso: \n\n" + this.getCurso().mostrar());
		         
 
				
		
		
	}
	
	

}
