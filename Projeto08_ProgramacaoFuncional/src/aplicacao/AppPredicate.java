package aplicacao;

import java.util.function.Predicate;
import classe.Curso;

public class AppPredicate {
	public static void main(String[] args) {
		
		Predicate<Curso> pred = p -> p.getPreco() > 1000;
		
		boolean resposta = pred.test(new Curso(10, "JAVA", 100, 850));
		
		System.out.println(resposta);		
		
	}
}
