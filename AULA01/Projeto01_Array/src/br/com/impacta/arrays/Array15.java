package br.com.impacta.arrays;

import java.util.Random;

public class Array15 {

	public static void main(String[] args) {
		
		/* Faça um Programa que leia 20 números inteiros aleatórios 
		 * (entre 0 e 100)
		 armazene-os num array.
		 Ao final mostre os números e seus sucessores.
				
	    Random random = new Random();		
		int numero = random.nextInt(100);		
		System.out.println(numero);
		*/	
		
		
		Random random = new Random();
		
		int[] numerosAleatorios = new int[20];
		
		
		for (int i = 0; i < numerosAleatorios.length; i++) {
			int numero = random.nextInt(100);
			numerosAleatorios[i]= numero;
		}
		
		System.out.println("Números Aleatórios:");
		for (int numero : numerosAleatorios) {
			System.out.println(numero);
		}
		
		System.out.println("Números Sucessores:");
		for (int numero : numerosAleatorios) {			
			System.out.println(++numero);
		}
	}
}
