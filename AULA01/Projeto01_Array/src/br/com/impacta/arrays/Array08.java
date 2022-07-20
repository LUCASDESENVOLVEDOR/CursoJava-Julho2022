package br.com.impacta.arrays;

import javax.swing.JOptionPane;

public class Array08 {
	public static void main(String[] args) {
		
		/*Faça um programa que pergunte ao usuario a  quantidade do array,
            depois informe qual o valor em cada posição, 
            em seguida, 
            mostre na tela todos os números pares, e também a quantidade 
            de números pares. */
		
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog
				("Informe a quantidade de números"));
		
		int[]numeros = new int[quantidade];
		
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Integer.parseInt
					(JOptionPane.showInputDialog
							("Informe o numero: " + (i+1)));
	     }	
			
		int quantidadePar = 0;
		
		for (int numeroAtual : numeros) {			
			//analise se o numero é par.
			if(numeroAtual % 2 == 0) {
				//quantidadePar = quantidadePar + 1;				
				quantidadePar++;
				System.out.println("Número par: " + numeroAtual);
			}
		}
		
		System.out.println("Quantidade de pares é :" + quantidadePar );
				
	}
}
