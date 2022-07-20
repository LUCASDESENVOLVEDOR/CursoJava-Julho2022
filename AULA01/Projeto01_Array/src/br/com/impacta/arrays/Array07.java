package br.com.impacta.arrays;

import javax.swing.JOptionPane;

public class Array07 {
	public static void main(String[] args) {
		
				
		/* Faça um programa que pergunte a quantidade do array ao usuario.
		 * depois informe qual o valor em cada posição, e no final
		 * mostre na tela apenas as numeros negativos.
		 */
		
		int quantidade = Integer.parseInt(JOptionPane.
				showInputDialog("Informe a quantidade de números do array"));
		
		int[] numeros = new int[quantidade];
		
		//se quantidade for menor ou igual a 0 OU
		// quantidade maior que 10.
		
		if(quantidade <= 0 || quantidade > 10) {		
			
			JOptionPane.showMessageDialog(null,
					"A quantidade deve ser maior que zero e menor que 10",
					 "Erro",
					 JOptionPane.ERROR_MESSAGE);			 
			 return;			
		}
		
		for (int i = 0; i < numeros.length; i++) {			
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero: " + (i+1)));
		}
		
		for (int numeroAtual : numeros) {			
			if(numeroAtual < 0)
				System.out.println(numeroAtual);	
		}		
		
	}

}
