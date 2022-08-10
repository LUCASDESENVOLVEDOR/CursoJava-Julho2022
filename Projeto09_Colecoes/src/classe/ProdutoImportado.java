package classe;

public class ProdutoImportado extends Produto {
	
	public ProdutoImportado(String categoria,
			String descricao, double preco) {
		super(categoria, descricao, preco);		
	}
	
	//sobrecarga de construtor.
	public ProdutoImportado(String categoria,
			String descricao, double preco, double taxaImportacao) {		
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

	@Override
	public String mostrar() {
		// TODO Auto-generated method stub
		return super.mostrar() + "\nTaxa importação: " +  this.getTaxaImportacao();
	}
	
	//criar override de mostrar
	
	
	
	

}
