package br.com.impacta.arrays;

import javax.swing.JOptionPane;

public class Array08 {
	public static void main(String[] args) {
		
		/*Fa�a um programa que pergunte ao usuario a  quantidade do array,
            depois informe qual o valor em cada posi��o, 
            em seguida, 
            mostre na tela todos os n�meros pares, e tamb�m a quantidade 
            de n�meros pares. */
		
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog
				("Informe a quantidade de n�meros"));
		
		int[]numeros = new int[quantidade];
		
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Integer.parseInt
					(JOptionPane.showInputDialog
							("Informe o numero: " + (i+1)));
	     }	
			
		int quantidadePar = 0;
		
		for (int numeroAtual : numeros) {			
			//analise se o numero � par.
			if(numeroAtual % 2 == 0) {
				//quantidadePar = quantidadePar + 1;				
				quantidadePar++;
				System.out.println("N�mero par: " + numeroAtual);
			}
		}
		
		System.out.println("Quantidade de pares � :" + quantidadePar );
				
	}
}
