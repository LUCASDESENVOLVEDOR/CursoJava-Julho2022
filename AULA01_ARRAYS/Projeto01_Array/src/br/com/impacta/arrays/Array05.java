package br.com.impacta.arrays;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Array05 {

	public static void main(String[] args) {		
		
		 int quantidade = Integer.parseInt( JOptionPane.
				 showInputDialog("Informe a quantidade de nomes:"));
		 
		 if(quantidade <= 0) {		 
			 
			 JOptionPane.showMessageDialog(null, "A quantidade deve ser maior que zero!",
					 "Erro",
					 JOptionPane.ERROR_MESSAGE);			 
			 return;			
		 }		 
		   
		 String[] nomes = new String[quantidade];	 
		
		  for (int i = 0; i < nomes.length; i++) {		  
			  //jop + ctrl + space.
			 		  
			  nomes[i] = JOptionPane.showInputDialog("Informe o nome: " + (i+1));
		  }
		  
		  //Arrays classe		  
//		  /sort metodo		  
		  //nomes = arrays enviado como parametro.
		  
		  Arrays.sort(nomes);
		  
		  //foreach + ctrl + space
		  
		  for (String nome : nomes) {
			  System.out.println(nome);  
		   }
	}

}
