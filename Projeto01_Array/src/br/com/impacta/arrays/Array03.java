package br.com.impacta.arrays;

public class Array03 {
	public static void main(String[] args) {
		
		int[] numeros = {17,13,18,25,39,17};		

		//String[] diassemana= {"segunda","terça"}
		
		
		for(int numero : numeros) {
			System.out.println(numero);
		}		
	
		//array vai referenciar outro objeto.	
		numeros = new int[] {2,5,7,1,0};		
		
		for(int numero : numeros) {
			System.out.println(numero);
		}		
		
	}		
}
