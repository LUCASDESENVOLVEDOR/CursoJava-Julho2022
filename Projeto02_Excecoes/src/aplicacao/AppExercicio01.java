package aplicacao;

public class AppExercicio01 {
	public static void main(String[] args) {
		
		//1- Escreva um programa java usando vários blocos catch.Dentro do bloco try, 
		   //declare um array a[] e inicialize com o valor a[5] =30/5;
		//Em cada bloco catch mostre ArithmeticException e ArrayIndexOutOfBoundsException.
		
		try {
			
			int a[] = new int[5];
			a[4] =30/0;
			System.out.println(a[4]);
			
		}
		catch (ArithmeticException e) {
			System.out.println("Erro de ArithmeticException");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro de ArrayIndexOutOfBoundsException");
		}
		catch(Exception e) {
			System.out.println("Erro inesperado.");			
			
		}	
		
	}

}
