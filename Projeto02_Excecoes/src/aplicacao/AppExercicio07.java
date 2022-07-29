package aplicacao;

import javax.swing.JOptionPane;

public class AppExercicio07 {
	public static void main(String[] args) {
		
		//7- Crie uma aplicação onde o usuario irá informar 
		//2 numeros, divida um pelo outro. 
		
		//Adicione um tratamento ArithmeticException 
		//e um finally com uma informação se o codigo 
		//executou corretamente ou nao.
		
		 Boolean validacao = true;
		
		  try {
			 
			 int numero1 = Integer.parseInt
			    (JOptionPane.showInputDialog("Informe o primeiro número"));
			 int numero2 = Integer.parseInt
			    (JOptionPane.showInputDialog("Informe o segundo número"));
				
			 int resultado = numero1/numero2;
			 
			  
			}
			catch (ArithmeticException e1) { 
				validacao = false;
			}
			finally {
				System.out.println("Resultado: " + validacao);				
			}	
	}
}
