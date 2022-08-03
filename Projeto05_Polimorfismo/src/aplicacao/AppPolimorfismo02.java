package aplicacao;

import javax.swing.JOptionPane;

import classe.Aluno;
import classe.Curso;
import classe.Funcionario;
import classe.Pessoa;

public class AppPolimorfismo02 {

	public static void main(String[] args) {
		
		//Quem executa um método é o objeto, nunca a variavel!!!
		
		Pessoa p1 = new Funcionario("Lucas", 29, "DBA",10);
		JOptionPane.showMessageDialog(null, p1.mostrar());
		
		Aluno p2 = new Aluno("Luiz",20,123, new Curso(10,"Java",40,10));		
		JOptionPane.showMessageDialog(null, p1.mostrar());	
		
		mostrarPessoa(p1);
		mostrarPessoa(p2);

	}
	
	private static void mostrarPessoa(Pessoa p) {
		
		String nomeClasase = p.getClass().getSimpleName();
		String resposta = p.mostrar();	
		
		JOptionPane.showMessageDialog(null, "Classe: " + nomeClasase + "\n"
				+ resposta);		
		
	}
	
	

}
