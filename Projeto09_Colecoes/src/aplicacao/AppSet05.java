package aplicacao;

import java.util.LinkedHashSet;
import java.util.Set;
import classe.Curso;

public class AppSet05 {
	public static void main(String[] args) {
		
		Set<Curso> cursos = new LinkedHashSet<>();
		
		cursos.add(new Curso(100,"PHP", 40,1200));
		cursos.add(new Curso(200,"Ingl�s Instrumental", 100,1500));
		cursos.add(new Curso(300,"Node", 8,5000));
		cursos.add(new Curso(100,"PHP", 40,1200));		
		
		cursos.forEach(s -> System.out.println(s.mostrar() + "\n"));		
		
		//VERIFICA��ES REALIZADAS PELO SET
		   // se os objetos possuem a mesma identidade.
		   // se os objetos possuem o mesmo c�digo hash.
		
		
	}
}
