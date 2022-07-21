package br.com.impacta.arrays;

import javax.swing.JOptionPane;

public class Array11 {

	public static void main(String[] args) {
		
		/*
		 * 5 - Fazer um programa para ler um n�mero inteiro 
		 * N (solicitar o tamanho do array) e depois 
		 *     criar um array criar  n�meros reais (double). Em seguida,
		 *  mostrar na tela a m�dia aritm�tica de todos elementos com tr�s
		 *   casas decimais. 
		 *   Depois mostrar todos os elementos do array que estejam abaixo
		 *    da m�dia, com uma casa decimal cada.* 		 * 
		 */
		
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog
				("Informe a quantidade de n�meros do array"));
		
		double[]arrayDouble = new double[quantidade];
		
		for (int i = 0; i < arrayDouble.length; i++) {
			arrayDouble[i] = Double.parseDouble(
					JOptionPane.showInputDialog
							("Informe o numero da posi��o: " + (i+1)));
	     }
		
		//m�dia aritm�tica de todos elementos com tr�s
		//casas decimais.		
		 double soma = 0;
		 double media = 0;
		 
		 for (double valor : arrayDouble) {
			 soma += valor;
		 }
		 
		 media = soma/quantidade;
		
		 System.out.printf("M�dia do array: %.3f\n", media);		 
		 System.out.println("Elementos abaixo da m�dia:");
		 
		 for (double elemento : arrayDouble) {
			 
			 if(elemento < media)
				 System.out.printf("%.1f\n", elemento);			
		}
		 
		 
		 
		 
		 
	}
}
