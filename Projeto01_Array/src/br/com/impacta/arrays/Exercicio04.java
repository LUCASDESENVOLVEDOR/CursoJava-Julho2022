package br.com.impacta.arrays;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class Exercicio04 {

	public static void main(String[] args) {
		
		//4- Crie um array bidimenssional e solicite ao usuario 
		//todos os valores, após crie um segundo array e faça uma cópia 
		//do primeiro.
		
		int quantidadeLinhas = Integer.parseInt(JOptionPane.
				showInputDialog("Informe a quantidade de linhas:"));
		

		int quantidadeColunas = Integer.parseInt(JOptionPane.
				showInputDialog("Informe a quantidade de colunas:"));
		
		int array[][] = new int[quantidadeLinhas][quantidadeColunas];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {				
				array[i][j] =  Integer.parseInt(JOptionPane.
						showInputDialog("Informe o valor:" + (i+1)));				
			}
		}
		
		//crie um segundo array e faça uma cópia do primeiro.
		
		int arrayCopia[][] = new int[quantidadeLinhas][quantidadeColunas];
		
		for (int i = 0; i < arrayCopia.length; i++) {
			for (int j = 0; j < arrayCopia.length; j++) {				
				arrayCopia[i][j] = array[i][j];
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
