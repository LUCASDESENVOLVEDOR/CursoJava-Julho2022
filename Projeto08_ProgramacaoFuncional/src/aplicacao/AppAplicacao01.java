package aplicacao;

import interfaces.Operacao01;

public class AppAplicacao01 {
	public static void main(String[] args) {
		
		Operacao01 op1 = s ->  s.length(); 
			
		int retorno = op1.executar("Curso Java");
		
		System.out.println("Retorno " + retorno);
		
		
		//parametro = texto.
		//retorno=  numero de palavras.		
		// O curso de hoje comeca hoje.
		
		Operacao01 op2 =  s-> {
			
			String texto = s.trim();			
			String[] itens = texto.split(" ");
			
			int contador = 0;
			for (String elemento : itens) {
				if(elemento.length() > 0)
					contador++;				
			}
			
			return contador;		
			
		};
				
		String texto = "O curso ja comecou";		
		int totalPalavras = op2.executar(texto);		
		System.out.println("Total de palavras: " + totalPalavras);
		
		
	}
}
