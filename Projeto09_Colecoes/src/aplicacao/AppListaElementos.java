package aplicacao;

import classe.ListaElementos;

public class AppListaElementos {
	public static void main(String[] args) {
		
		//criar um array de String com alguns nomes.
		String[] nomes = {"Sérgio","Luana","Ana Paula", "Gerson", "Lucas"};
		
		// adicionar esse array no metodo receber dados.
		ListaElementos<String> lista = new ListaElementos<>();
		lista.receberDados(nomes);
		
		String resposta1 = lista.buscar(p ->  p.startsWith("A"));		
		String resposta2 = lista.buscar(p -> p.length() == 5);		
		String resposta3 = lista.buscar(p -> p.endsWith("a"));
		
		System.out.println("resposta 1: " + resposta1);
		System.out.println("resposta 2: " + resposta2);
		System.out.println("resposta 3: " + resposta3);				
		
	}

}
