package br.com.impacta.arrays;

public class Exercicio03 {

	public static void main(String[] args) {
		
		//3- Use o Array fornecido abaixo que é chamado de nome.
		//O Array, como o nome sugere, contém nomes diferentes.
		//O objetivo é imprimir os elementos do array em ordem inversa. 
		//Em outras palavras, primeiro Carl, depois Rebecca e 
		//assim por diante:

		String[] nome = 
			{"Jonas", "Tina", "Tom", "Steve", "Amanda", 
					"Hanna", "Rebecca", "Carl"};
		
		for (int i = nome.length-1; i >= 0; i--) {			
			System.out.println(nome[i]);			
		}

		System.out.println();
		
		for (int i = 0; i < nome.length; i++) {				
			System.out.println(nome[nome.length-1-i]);		
			
		}
		
		
		

	}

}
