package br.com.impacta.arrays;

import javax.swing.JOptionPane;

public class Array09 {

	public static void main(String[] args) {
		
		/*Fa�a um programa que pergunte ao usuario a  
		 * quantidade do array, depois informe qual o valor
		 *  em cada posi��o, em seguida, 
		 *  mostre na tela o maior n�mero do 
		 *  array(supor n�o haver empates). 
		 *  Mostrar tamb�m a posi��o do maior elemento,
		 *   considerando a primeira posi��o como 0 (zero).
		 *   
		 *   Por exemplo o usuario enviar tamanho do array 4
		 *   numeros:  {4,20,7,9}
		 *   
		 *   Maior numero: 20.
		 *   Posi��o do array : 1. 
		 *   
		 */
		
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog
				("Informe a quantidade de n�meros"));
		
		int[]numeros = new int[quantidade];
		
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Integer.parseInt
					(JOptionPane.showInputDialog
							("Informe o numero: " + (i+1)));
	     }	
		
		
		int NumeroMaior = 0;
		int posicaoMaior = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			
			if(numeros[i] > NumeroMaior) {				
				NumeroMaior = numeros[i];			
				posicaoMaior = i;
			}
		}
		
		System.out.println("O maior valor �:" + NumeroMaior);
		System.out.println("A posi��o do maior valor:" + posicaoMaior);
		
		
		
		
		
		
		
		

	}

}
