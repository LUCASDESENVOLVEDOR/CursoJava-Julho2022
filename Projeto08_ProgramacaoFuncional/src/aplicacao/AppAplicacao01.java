package aplicacao;

import interfaces.Operacao01;

public class AppAplicacao01 {
	
	public static int contarPalavras(String s) {
		
		String texto = s.trim();			
		String[] itens = texto.split(" ");
		
		int contador = 0;
		for (String elemento : itens) {
			if(elemento.length() > 0) //nao ira contar os espacos em branco.
				contador++;				
		}
		
		return contador;	
		
		
	}
	
	
	public static void main(String[] args) {
		
		Operacao01 op1 = s ->  s.length();
		
		int retorno = op1.executar("Curso Java");		
		System.out.println("Retorno " + retorno);	
		
		//parametro = texto.
		//retorno=  numero de pal+avras.		
		// O curso de JAVA comeca hoje.
		
		Operacao01 op2 =  s-> {
			
			String texto = s.trim();			
			String[] itens = texto.split(" ");
			
			int contador = 0;
			for (String elemento : itens) {
				if(elemento.length() > 0) //nao ira contar os espacos em branco.
					contador++;				
			}
			
			return contador;		
			
		};
				
		//\n \r \"
		String texto = "O \"curso\" ja comecou";		
		int totalPalavras = op2.executar(texto);		
		System.out.println("Total de palavras: " + totalPalavras);
		System.out.println(texto);	
		
		Operacao01 op3 = s-> contarPalavras(s);
		
		System.out.println(op3.executar
				("Esse código é mto comum de acontecer") + " palavras");
		
		
	}
}
