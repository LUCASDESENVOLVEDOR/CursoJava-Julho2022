package aplicacao;

import javax.swing.JOptionPane;

public class AppExcecoes04 {

	public static void main(String[] args) {	
		
        //try = tente realizar o codigo.
		
		try {			
			
			String nome = JOptionPane.showInputDialog("Informe seu nome:");	
			
			
			JOptionPane.showMessageDialog(null, nome.toUpperCase());
			
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));			
			JOptionPane.showMessageDialog(null, "Idade informada: " + idade);
			
		}
		
		catch(NumberFormatException e) {
		JOptionPane.showMessageDialog(null, "A idade está incorreta.");			
		}
		catch(NullPointerException e) {
			JOptionPane.showMessageDialog(null, "O nome está incorreto.");			
		}	
		
		
		catch(Exception e) {
			
			String classe = e.getClass().getSimpleName();
			
			JOptionPane.showMessageDialog(null,
					"Classe: "  + classe + "\n Erro geral: " + e.getMessage());
		
		    e.printStackTrace();
		
		}
	}

}
