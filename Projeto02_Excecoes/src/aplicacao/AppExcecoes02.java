package aplicacao;

import javax.swing.JOptionPane;

public class AppExcecoes02 {

	public static void main(String[] args) {	
		
        //try = tente realizar o codigo.
		
		try {			
			
			String nome = JOptionPane.showInputDialog("Informe seu nome:");	
			JOptionPane.showMessageDialog(null, nome.toUpperCase());
			
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));			
			JOptionPane.showMessageDialog(null, "Idade informada: " + idade);
			
		}
		catch(NumberFormatException | NullPointerException erro) {
			JOptionPane.showMessageDialog(null, "Idade/Nome estão incorretos.");			
		}
		
		
				
		

	}

}
