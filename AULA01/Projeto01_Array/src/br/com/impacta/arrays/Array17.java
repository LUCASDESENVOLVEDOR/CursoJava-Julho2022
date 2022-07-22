package br.com.impacta.arrays;

public class Array17 {

	public static void main(String[] args) {
		
		//array multidimensional
		
		                           
		int[][] numPessoas = new int[3][4];
		
		
		numPessoas[0][0] = 3;
		numPessoas[0][1] = 10;
		numPessoas[0][2] = 20;
		numPessoas[0][3] = 40;
		
		numPessoas[1][0] = 60;
		numPessoas[1][1] = 23;
		numPessoas[1][2] = 45;
		numPessoas[1][3] = 98;
		
		numPessoas[2][0] = 213;
		numPessoas[2][1] = 2;
		numPessoas[2][2] = 3;
		numPessoas[2][3] = 1;
		
		for (int i = 0; i < numPessoas.length; i++) {
			
			for (int j = 0; j < numPessoas[i].length; j++) {
				System.out.print(numPessoas[i][j] + "\t");
			}
			
			System.out.println();			
		}
	}
}
