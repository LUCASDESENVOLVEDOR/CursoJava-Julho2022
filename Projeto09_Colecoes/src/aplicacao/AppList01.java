package aplicacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppList01 {
	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		
		
		nomes.add("Maria");
		nomes.add("Joaquim");
		nomes.add("Lucas");
		nomes.add("Ana");
		
		nomes.remove(1);		
		//nomes.removeIf(p -> p.endsWith("a"));
			
		//formas de apresentacao.
		
		//System.out.println(nomes);
		
		//for (String nome : nomes) {
		//	System.out.println(nome);
		//}	
		
		nomes.forEach(s -> System.out.println(s));
			
		Collections.sort(nomes);
		
		System.out.println();
		nomes.forEach(s -> System.out.println(s));		
	}

}
