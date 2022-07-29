package aplicacao;
import javax.swing.JOptionPane;
import classe.Pessoa;

public class AppPessoa01 {
 
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Lucas");
		pessoa.setIdade(29);
		JOptionPane.showMessageDialog(null, pessoa.mostrar());		
		
	}
}
