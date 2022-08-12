package aplicacao;

import java.util.LinkedHashSet;
import java.util.Set;
import classe.Curso;

public class AppSet05 {
	public static void main(String[] args) {
		
		Set<Curso> cursos = new LinkedHashSet<>();
		
		cursos.add(new Curso(100,"PHP", 40,1200));
		cursos.add(new Curso(200,"Inglês Instrumental", 100,1500));
		cursos.add(new Curso(300,"Node", 8,5000));
		cursos.add(new Curso(100,"PHP", 40,1200));		
		
		cursos.forEach(s -> System.out.println(s.mostrar() + "\n"));		
		
		//VERIFICAÇÕES REALIZADAS PELO SET
		   // se os objetos possuem a mesma identidade.
		   // se os objetos possuem o mesmo código hash.
		
		
	}
}


/*Exercicio 01 -

	CRIAR UMA APLICACAO CHAMADA APPSET06 - 
	
	CRIE UMA LISTA UTILIZANDO SET<Produto>, adicione 3 produtos onde 
	1 será duplicado.
	
	implemente em Produto Overrride de HASHCODE e EQUALS 
	assim como realizado em CURSO.
	
	para que ao exbir a lista aparece apenas 2 produtos.

*/









