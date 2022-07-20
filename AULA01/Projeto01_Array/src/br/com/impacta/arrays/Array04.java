package br.com.impacta.arrays;
import javax.swing.JOptionPane;

public class Array04 {
	
   public static void main(String[] args) {
	   
	// o usuario fornece alguns nomes 
	   //de pessoa para uma lista.
	   
	 String[] nomes = new String[4];	 
	
	  for (int i = 0; i < nomes.length; i++) {		  
		  //jop + ctrl + space.
		 		  
		  nomes[i] = JOptionPane.showInputDialog("Informe o nome: " + (i+1));
	  }
	  
	  //foreach + ctrl + space
	  
	  for (String nome : nomes) {
		  System.out.println(nome);  
	   }    
   }

}
