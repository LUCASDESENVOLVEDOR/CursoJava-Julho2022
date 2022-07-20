package br.com.impacta.arrays;

import javax.swing.JOptionPane;

public class Array10 {

	public static void main(String[] args) {
		
		/*Faça um programa para ler dois arrays A e B, 
		 * pergunte ao usuario a  
		 * quantidade do array e os valores de cada array.
		 * Em seguida, gere um terceiro array C 
		 * onde cada elemento de C é a soma dos 
		 * elementos correspondentes de A e B.
		 *  Imprima o array C gerado.
		 */
		
		
		/*
		 * qual a quantidade = 3
		 * array A = 3 (quantidade)
		 * array b = 3  (quantidade)
		 * array c = 3 (quantidade)
		 * 
		 * dados do A
		 * dados do B
		 * 		 * 
		 * percorrer o C vao somar o index de A e B.		 * 
		 * 
		 * a[0] = 2
		 * b[0] = 1		 * 
		 * 
		 * c[0]= (a[0]+ b[0]) = 3
		 * 		 * 
		 * 
		 */
		
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog
				("Informe a quantidade de números"));
		
		int[]A = new int[quantidade];
		int[]B = new int[quantidade];
		int[]C = new int[quantidade];
		
		for (int i = 0; i < A.length; i++) {
			A[i] = Integer.parseInt
					(JOptionPane.showInputDialog
							("Array A - Informe o numero: " + (i+1)));
	     }		
		
		for (int i = 0; i < B.length; i++) {
			B[i] = Integer.parseInt
					(JOptionPane.showInputDialog
							("Array B - Informe o numero: " + (i+1)));
	     }		
		
		for (int i = 0; i < C.length; i++) {
			//a posicao C[0] = A[0]+B[0]
			C[i] = A[i]+B[i];
		}	
		
		for (int numeroAtual : C) {
			System.out.println("Valores C: " + numeroAtual);
		}
	}
}
