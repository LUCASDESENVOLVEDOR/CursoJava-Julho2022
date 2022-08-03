package aplicacao;

import javax.swing.JOptionPane;

import classe.Funcionario;
import classe.Pessoa;

public class AppPoliformismo04 {
	public static void main(String[] args) {
		
		Pessoa p1 = new Funcionario("Lucas", 29, "DBA",10);
		
		//Desejamos alterar o valor do salario.
		
		//TYPECAST		
		if(p1 instanceof Funcionario) {			
			Funcionario func = (Funcionario)p1;		
			func.setSalario(400);
		}
		
		JOptionPane.showMessageDialog(null, p1.mostrar());
		
	}
}
