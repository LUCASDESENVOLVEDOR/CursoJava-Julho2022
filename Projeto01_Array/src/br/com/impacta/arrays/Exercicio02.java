package br.com.impacta.arrays;

import java.util.Random;

public class Exercicio02 {
	public static void main(String[] args) {
		
		//2- Gere e imprima uma matriz chamada M de 4x4 ([4][4]) 
		//com valores aleatórios entre 0-9
		
		Random random = new Random();
		
		int[][] M = new int[4][4];
		
		//[4] 
		 // para cada posicao temos que percorrer mais 4 vezes.
		
		//gerando numeros aleatorios em cada posicao.
		for (int i = 0; i < M.length; i++) 
		{			
			for (int j = 0; j < M.length; j++) {
				M[i][j] = random.nextInt(9);								
			}
			
		}		
		
		System.out.println("Valores do array:");
		
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M.length; j++) {
				System.out.println(M[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
