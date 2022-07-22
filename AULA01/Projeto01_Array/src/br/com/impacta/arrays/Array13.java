package br.com.impacta.arrays;

public class Array13 {

	public static void main(String[] args) {
		
		/*
		 * Escreva um programa para encontrar os valores duplicados de 
		 * uma matriz de valores inteiros, 
		 * int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};
		 */		
		  int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};
		
		  //utilizar 2 "for's".		  
		  for (int i = 0; i < my_array.length; i++) {
			  //1
			  for (int j = i+1; j < my_array.length; j++) {
				  //2 //5 // 5 //6 //6 //7 //2				  
			 	if(my_array[i] == my_array[j])
			 		System.out.println("Valor duplicado:" + my_array[j]);			
			}
		 }
	}
}
