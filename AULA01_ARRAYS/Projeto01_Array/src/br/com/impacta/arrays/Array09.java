package br.com.impacta.arrays;

import javax.swing.JOptionPane;

public class Array09 {

	public static void main(String[] args) {
		
		/*Faça um programa que pergunte ao usuario a  
		 * quantidade do array, depois informe qual o valor
		 *  em cada posição, em seguida, 
		 *  mostre na tela o maior número do 
		 *  array(supor não haver empates). 
		 *  Mostrar também a posição do maior elemento,
		 *   considerando a primeira posição como 0 (zero).
		 *   
		 *   Por exemplo o usuario enviar tamanho do array 4
		 *   numeros:  {4,20,7,9}
		 *   
		 *   Maior numero: 20.
		 *   Posição do array : 1. 
		 *   
		 */
		
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog
				("Informe a quantidade de números"));
		
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
		
		System.out.println("O maior valor é:" + NumeroMaior);
		System.out.println("A posição do maior valor:" + posicaoMaior);
		
		
		
		
		
		
		
		

	}

}
