package Aplicacao;

import java.io.FileWriter;

import javax.swing.JOptionPane;

public class AppGravacaoArquivo02 {
	
	public static void main(String[] args) {
		
		try {
			
			//Classe FileWriter		
			FileWriter writer = new
	          FileWriter("C:\\Users\\Lucas - Senai\\Documents\\CursoJava\\Arquivos\\arquivo01.txt"
	        		  , true);		
			
			while(true) {
				
				String texto = JOptionPane.showInputDialog("Escreva um texto");
				
				//\n new line			
				///r = Carriage retun - retorno do carro			
				writer.write(texto + "\r\n");
				
				int opcao = JOptionPane.showConfirmDialog(null, "Deseja continuar?",
						"Confirmação",
						JOptionPane.YES_NO_OPTION);
				 
				if(opcao == JOptionPane.NO_OPTION) {
					break;					
				}
			}		
				
			
			writer.close();	
			
			JOptionPane.showMessageDialog(null,"Arquivo criado com sucesso!");			
			
			
		}
		
		catch (Exception e) {
			
			JOptionPane.showMessageDialog(null, e.getMessage());		
			
		}
		
		
		
	}
}


