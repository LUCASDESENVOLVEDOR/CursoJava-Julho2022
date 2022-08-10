package aplicacao;

import classe.Curso;
import interfaces.Operacao04;

public class AppOperacao04 {
	public static void main(String[] args) {
		
		Operacao04<Curso, String> op1 = p -> p.getDescricao(); 
		
		System.out.println(op1.executar(new Curso(10, "JAVA", 100,850)));
		
	}
}
