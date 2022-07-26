package aplicacao;

import javax.swing.JOptionPane;

public class AppExcecoes01 {

	public static void main(String[] args) {
		
		
        //try = tente realizar o codigo.
		
		try {			
			
			String nome = JOptionPane.showInputDialog("Informe seu nome:");		
				
			JOptionPane.showMessageDialog(null, nome.toUpperCase());
			
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));			
			JOptionPane.showMessageDialog(null, "Idade informada: " + idade);
			
		}
		catch(NumberFormatException erro) {
			JOptionPane.showMessageDialog(null, "Por favor informe sua idade com número.");			
		}
		catch(NullPointerException erro) {
			JOptionPane.showMessageDialog(null, "Por favor informe o seu nome.");			
		}		
		

	}

}
