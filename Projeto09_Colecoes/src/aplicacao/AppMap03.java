package aplicacao;

import java.util.Map;
import java.util.TreeMap;

public class AppMap03 {
	
	public static void main(String[] args) {
		Map<Double,String> Pagamentos = new TreeMap<>();
		Pagamentos.put(40.5, "Pagamento1");
		Pagamentos.put(60.5, "Pagamento2");		
		Pagamentos.forEach((k,v) -> System.out.println(k + " - " + v));   
		  
		
	}

}


/* Crie uma classe chamada Tarefa
 *  Date date,
 *  String descricao
 *  int duracao
 *  
 *  GET SET  - e façam o construtor.
 */





