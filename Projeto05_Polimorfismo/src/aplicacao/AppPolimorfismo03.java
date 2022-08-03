package aplicacao;

import javax.swing.JOptionPane;

import classe.Produto;
import classe.ProdutoImportado;

public class AppPolimorfismo03 {
	public static void main(String[] args) {
		
		Produto prod = new Produto("Alimentação", "Batata Frita",50);
		
		Produto prod2 = new  ProdutoImportado("Transporte","Bicicleta", 2500,1.6);
		
		JOptionPane.showMessageDialog(null, prod.mostrar());
		JOptionPane.showMessageDialog(null, prod2.mostrar());
		
		
	}

}
