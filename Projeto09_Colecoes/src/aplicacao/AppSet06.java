package aplicacao;

import java.util.LinkedHashSet;
import java.util.Set;

import classe.Produto;

/*Exercicio 01 -

CRIE UMA LISTA UTILIZANDO SET<Produto>, adicione 3 produtos onde 
1 será duplicado.

implemente em Produto Overrride de HASHCODE e EQUALS 
assim como realizado em CURSO.

para que ao exbir a lista aparece apenas 2 produtos.

*/


public class AppSet06 {
	public static void main(String[] args) {
		

		Set<Produto> produtos = new LinkedHashSet<>();
		produtos.add(new Produto("Informática", "Laptop",40));
		produtos.add(new Produto("Limpeza", "Sabonete",3));
		produtos.add(new Produto("Informática", "Laptop",40));
		
		produtos.forEach(s -> System.out.println(s.mostrar()));


		
		
	}

}
