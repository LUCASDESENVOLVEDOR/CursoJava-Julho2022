package aplicacao;

import javax.swing.JOptionPane;

import classe.Aluno;
import classe.Curso;
import classe.Funcionario;
import classe.Pessoa;

public class AppPolimorfismo01 {

	public static void main(String[] args) {
		
		//Quem executa um método é o objeto, nunca a variavel!!!
		
		Pessoa p1 = new Funcionario("Lucas", 29, "DBA",10);
		JOptionPane.showMessageDialog(null, p1.mostrar());
		
		p1 = new Aluno("Luiz",20,123, new Curso(10,"Java",40,10));
		
		JOptionPane.showMessageDialog(null, p1.mostrar());
		
		

	}

}
