package br.com.impacta.arrays;

import javax.swing.JOptionPane;

public class Array11 {

	public static void main(String[] args) {
		
		/*
		 * 5 - Fazer um programa para ler um número inteiro 
		 * N (solicitar o tamanho do array) e depois 
		 *     criar um array criar  números reais (double). Em seguida,
		 *  mostrar na tela a média aritmética de todos elementos com três
		 *   casas decimais. 
		 *   Depois mostrar todos os elementos do array que estejam abaixo
		 *    da média, com uma casa decimal cada.* 		 * 
		 */
		
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog
				("Informe a quantidade de números do array"));
		
		double[]arrayDouble = new double[quantidade];
		
		for (int i = 0; i < arrayDouble.length; i++) {
			arrayDouble[i] = Double.parseDouble(
					JOptionPane.showInputDialog
							("Informe o numero da posição: " + (i+1)));
	     }
		
		//média aritmética de todos elementos com três
		//casas decimais.		
		 double soma = 0;
		 double media = 0;
		 
		 for (double valor : arrayDouble) {
			 soma += valor;
		 }
		 
		 media = soma/quantidade;
		
		 System.out.printf("Média do array: %.3f\n", media);		 
		 System.out.println("Elementos abaixo da média:");
		 
		 for (double elemento : arrayDouble) {
			 
			 if(elemento < media)
				 System.out.printf("%.1f\n", elemento);			
		}
		 
		 
		 
		 
		 
	}
}
