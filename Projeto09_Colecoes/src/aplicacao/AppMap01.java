package aplicacao;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class AppMap01 {
	public static void main(String[] args) {
		
		//Map<K,V> key, value.
		
		Map<Integer,String> nomes = new HashMap<>();
		
		nomes.put(132, "Binho");
		nomes.put(784,"Erasmo");
		nomes.put(487, "Daiane");
	    nomes.put(889, "Vinicius");
	    
	    for(Map.Entry<Integer, String> item : nomes.entrySet()) {	    	
	    	//System.out.println(item);	    	
	    	System.out.println(item.getKey() + " - " + item.getValue());	    	
	    }    
	    
	    //buscando um valor com base na chave.
	    int chave = Integer.parseInt(JOptionPane.showInputDialog("Informe uma chave: "));
	    
	    if(nomes.containsKey(chave)) {	    	
	    	//nomes.get(chave);	    	
	    	JOptionPane.showMessageDialog(null, "Valor encontrado: " + nomes.get(chave));	    	
	    }
	    else {
	    	JOptionPane.showMessageDialog(null, "Nenhum valor encontrado");
	    } 
	    
}
}
