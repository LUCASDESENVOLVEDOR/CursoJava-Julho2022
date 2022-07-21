package br.com.impacta.arrays;

import javax.swing.JOptionPane;

public class Array12 {

	
	public static boolean Existe(int[] array, int item) {
		
		for (int valorArray : array) {			
			if(valorArray == item) 
				return true;
		}	
		
		return false;		
	}
	
	
	public static void main(String[] args) {

	/*
	 * Escreva um programa para testar se um array contém um 
	 * valor específico.  int[] my_array1 = {
	            1789, 2035, 1899, 1456, 2013, 
	            1458, 2458, 1254, 1472, 2365, 
	            1456, 2265, 1457, 2456}; Crie um novo metodo que 
	            vai receber um parametro de array e outro de numero
	            e vai retornar se existe ou nao.
	 * 
	 * 
	 */
		  int[] my_array1 = { 1789, 2035, 1899, 1456, 2013, 
		            1458, 2458, 1254, 1472, 2365, 
		            1456, 2265, 1457, 2456};
		  
		  JOptionPane.showMessageDialog(null, Existe(my_array1,2), null, 0);
		  JOptionPane.showMessageDialog(null, Existe(my_array1,1472),
				  null, 0);
		  
		  System.out.println(Existe(my_array1,2));
		  System.out.println(Existe(my_array1,1472)); 
		  

	}

}
