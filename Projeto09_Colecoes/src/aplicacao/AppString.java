package aplicacao;

import classe.Curso;

public class AppString {

	public static void main(String[] args) {
		
		//Operador == para Objetos não compara conteúdo, compara 
		// a referência!!!		
		
		String s1 = "Java";
		String s2 = "Java";
		
		System.out.println("s1 == s2 ?" + (s1 == s2)); //TRUE
		
		String s3 =  new String("Java");
		String s4 =  new String("Java");
		
		System.out.println("s3 == s4 ?" + (s3 == s4)); //FALSE		
		System.out.println("s3.equals(s4)" + s3.equals(s4)); //TRUE
		
		//nunca compare conteudo com == 
		System.out.println();
		
		//utilizar a classe curso.			
		Curso c1 = new Curso(100, "PHP", 40,1200);
		Curso c2 = new Curso(100, "PHP", 40,1200);
		
		System.out.println("c1 == c2 ? " + (c1 == c2)); //false		
		System.out.println("c1.equals(c2) ? "+ (c1.equals(c2))); //TRUE		
	}
}
