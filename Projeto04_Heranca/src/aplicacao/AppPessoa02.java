package aplicacao;
import classe.Aluno;
import classe.Curso;
import classe.Funcionario;
import classe.Pessoa;

public class AppPessoa02 {
	
	public static void main(String[] args) {
		
		//instancia de pessoa.
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Lucas");
		pessoa.setIdade(29);
		
		//instancia da classe funcionario
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Igor");
		funcionario.setIdade(22);
		funcionario.setCargo("Eletricista");
		funcionario.setSalario(6000);

        //instancia da classe aluno.
		Aluno aluno = new Aluno();
		aluno.setNome("Luana");
		aluno.setIdade(20);
		aluno.setMatricula(12345);
		
//		Curso curso = new Curso();
//		curso.setCodigo(22);
//		curso.setDescricao("Java");
//		curso.setCargaHoraria(40);
//		curso.setPreco(100);		
	
		aluno.setCurso(new Curso(34,"Java 3",40,100));
		
		
	}
	
//	- Criar uma nova classe chamada Produto com o atributos
//	 (codigo, categoria, descricao, preco)
//	 
//	 Gerar get e set de todos os atributos e criar o metodo mostrar()
//	 
//	 
//	 Criar uma nova classe chamada ProdutoImportado que irá herdar 
//	 da produto e ter 2 atributos
//	 taxaImportacao
	 
	
	
	

}
