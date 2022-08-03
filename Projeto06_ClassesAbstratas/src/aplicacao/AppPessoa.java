package aplicacao;

import javax.swing.JOptionPane;

import classe.Aluno;
import classe.Curso;
import classe.Funcionario;
import classe.Pessoa;

public class AppPessoa {

	public static void main(String[] args) {
		//instancia de pessoa.
	//	Pessoa pessoa = new Pessoa();
	//	pessoa.setNome("Lucas");
	//	pessoa.setIdade(29);
	
	//JOptionPane.showMessageDialog(null, pessoa.mostrar());
	
	
	//instancia da classe funcionario
	Pessoa funcionario = new Funcionario();
	funcionario.setNome("Igor");
	funcionario.setIdade(22);
	((Funcionario)funcionario).setCargo("Eletricista");
	((Funcionario)funcionario).setSalario(6000);
	JOptionPane.showMessageDialog(null, funcionario.mostrar());
	
	

    //instancia da classe aluno.
	Pessoa aluno = new Aluno();
	aluno.setNome("Luana");
	aluno.setIdade(20);
	((Aluno)aluno).setMatricula(12345);
	
	//Curso curso = new Curso();
	//curso.setCodigo(22);
	//curso.setDescricao("Java");
	//curso.setCargaHoraria(40);
	//curso.setPreco(100);		

	((Aluno)aluno).setCurso(new Curso(34,"Java 3",40,100));		
	JOptionPane.showMessageDialog(null, aluno.mostrar());

		
	}
}
