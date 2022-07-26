package br.com.impacta.arrays;

public class Array01 {

	public static void main(String[] args) {			
	
		//definindo um array de inteiros.	
		int[] numeros = new int[6];		
		
		//atribuir valor individualmente.		
		numeros[0] = 20;
		numeros[1] = 10;
		numeros[2] = -12;
		numeros[3] = 0;
		numeros[4] = 8;
		numeros[5] = 8;
					
		//int i = 0; //variavel inicia do 0 e representa
		 // a posicao 0 do nosso array.				
		
		     //inicio   //fim  //incremento add 1 em 1
		
		//numeros.length = 5-1 = 4
		
		for (int i = 0; i <= numeros.length-1  ; i++) {				
			System.out.println(numeros[i]);	
		}	
		
		System.out.println(" ");
		//ao contrario.		
		for (int i = numeros.length-1; i >= 0; i--) {				
			System.out.println(numeros[i]);	
		}	
		
		
		//NAO É POSSIVEL REDIMENSSIONAR UM ARRAY.
		//DEPOIS DE CRIADO MUDA MAIS!

	}

}
