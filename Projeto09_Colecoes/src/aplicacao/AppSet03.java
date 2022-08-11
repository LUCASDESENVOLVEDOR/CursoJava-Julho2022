package aplicacao;
import java.util.LinkedHashSet;
import java.util.Set;
import classe.Produto;

public class AppSet03 {
	public static void main(String[] args) {
		
		//ctrl + shift + o = importa.
		
		Set<Produto> produtos = new LinkedHashSet<>();
		produtos.add(new Produto("Informática", "Laptop",40));
		produtos.add(new Produto("Limpeza", "Sabonete",3));
		produtos.add(new Produto("Alimentação", "Macarrão",100));
		
		//produtos.add(new Produto("Transporte", "Bicicleta",40));
		//produtos.add(new Produto("Transporte", "Bicicleta",40));
		
		Produto p = new Produto("Transporte", "Bicicleta",40);
		
		produtos.add(p);
		produtos.add(p);
		produtos.add(p);	
		
		produtos.forEach(s -> System.out.println(s.mostrar()));
		
		
	}

}
