package aplicacao;
import javax.swing.JOptionPane;

import classes.Pessoa;

public class AppPessoa01 {
	
	public static void main(String[] args) {
		
		try {
		
			Pessoa pessoa = new Pessoa();		
			pessoa.setNome(JOptionPane.showInputDialog(null, "Informe o nome da pessoa"));
			pessoa.setIdade(Integer.parseInt(JOptionPane.showInputDialog
					         (null, "Informe a idade da pessoa")));
		    
		    System.out.println("Nome da pessoa:" + pessoa.getNome() + " idade: "
		    		+ pessoa.getIdade());	
	    
		}
		catch (IllegalAccessException e) {
			e.printStackTrace();			
		}	    
	}	
}
