package aplicacao;

import javax.swing.JOptionPane;

import classe.DocumentoCNPJ;
import classe.DocumentoCpf;
import classe.Funcionario;

public class AppPessoaDocumento {
	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Lucas");
		funcionario.setIdade(29);
		funcionario.setCargo("Professor");
		funcionario.setSalario(10);
		//funcionario.setDocumento(new DocumentoCpf("35325231081"));
		
		funcionario.setDocumento(new DocumentoCNPJ("37192655000119"));
		JOptionPane.showMessageDialog(null, funcionario.mostrar());
				
	}
}
