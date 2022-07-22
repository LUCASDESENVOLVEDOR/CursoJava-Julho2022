package br.com.impacta.arrays;

public class Array14 {
	 public static void main(String[] args) {
				 
		 /*
		  * Para cada conjunto de valores abaixo, escreva um codigo,
		  * que preencha um array com os valores:
		  * 
		  * 10 9 8 7 6 5 4 3 2 1* 		  
		  * Dica: Array e For
		  */
		 
		   int[] array = new int[11];
		   
		   //looping para gerar os numeros de 10 a 1.
		   
		   for (int i = 10; i > 0; i--) {			   
			   //armazenar os numeros no array;
			   array[i] = i;			   
			   //console.
			   System.out.println(array[i]);			
		   }   	 
		 
		   System.out.println("\n");
		 
		 /*Desafio  0 1 4 9 16 25 36 49 64 81 100. */
		 
		   int[] array2 = new int[11];
		   
		   for (int i = 0; i < array2.length; i++) {
			   
			   //0 = 0
			   // 1 = 1
			   // 2 = 4
			   // 3 = 9
			   // 4 = 16			   
			   array2[i] = i * i;			   
			   System.out.println(array2[i]);			
		    }
		   
		   
		   System.out.println();	
		           // 0 1 3 4 5 6  7   8  9 10
		  //Desafio = 1 2 3 4 5 10 20 30 40 50. 
		   
		   int[] array3 = new int[10];
		   int x = 0;
		   
		   for (int i = 0; i < array3.length; i++) {
			   
			   if(i<5) {
				   array3[i] = i+1;
				   System.out.println(array3[i]);
				   }
			   else {
				   array3[i] =x+= 10;
				   System.out.println(array3[i]);				   
			   } 
		     }		 
		 
	}
}
