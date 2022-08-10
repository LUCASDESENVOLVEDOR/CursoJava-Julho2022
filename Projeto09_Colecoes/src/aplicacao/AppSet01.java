package aplicacao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AppSet01 {
	
	public static void main(String[] args) {
		
		//HashSet = coleção mais eficiente - porem nao garante ordem de nada.
		         // ele decide a ordem.
		
		         //remove os duplicados.
		
		
		Set<String> nomes = new HashSet<>();	
		
		nomes.add("Adriana");
		nomes.add("Maria");
		nomes.add("Joaquim");
		nomes.add("Lucas");
		nomes.add("Ana");
		nomes.add("Lucas");
		nomes.add("Brunno");
		
		System.out.println(nomes);
		
		
		
	}

}
