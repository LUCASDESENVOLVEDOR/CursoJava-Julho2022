package classe;

public class ProdutoImportado extends Produto {
	
	public ProdutoImportado(String categoria,
			String descricao, double preco) {
		super(categoria, descricao, preco);		
	}
	
	//sobrecarga de construtor.
	public ProdutoImportado(String categoria,
			String descricao, double preco, double taxaImportacao) {		
		//acionar o construtor responsavel por criar o produto.
		this(categoria, descricao, preco);		
		this.setTaxaImportacao(taxaImportacao);	
	}	

	private double taxaImportacao;

	public double getTaxaImportacao() {
		return taxaImportacao;
	}

	public void setTaxaImportacao(double taxaImportacao) {
		this.taxaImportacao = taxaImportacao;
	}	

}
