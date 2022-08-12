package aplicacao;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AppMap02 {
	
	public static void main(String[] args) {
			
		Map<Integer,String> nomes = new TreeMap<>();
		
		nomes.put(132, "Binho");
		nomes.put(784,"Erasmo");
		nomes.put(487, "Daiane");
	    nomes.put(889, "Vinicius");	    
	    nomes.forEach((k,v) -> System.out.println(k + " - " + v));    
	    
	}
}

//EXERCICIO - AppMap03 - 
 //Crie o seu MAP com Double,String faça a exibição por Foreach.



