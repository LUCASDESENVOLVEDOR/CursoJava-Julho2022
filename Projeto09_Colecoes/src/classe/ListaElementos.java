package classe;

import java.util.function.Predicate;

public class ListaElementos<T> {
	
	private T[] elementos;
	
     public void receberDados(T[] elementos) {
    	 this.elementos = elementos;
     }
     
     
     public T buscar(Predicate<T> busca) {
    	 
    	 for (T item: elementos) {
    		 if(busca.test(item)) {
    			 return item;
    		 }			
		}
    	 
    	 return null;   	 
    	 
     }
	
	
	
	

}
