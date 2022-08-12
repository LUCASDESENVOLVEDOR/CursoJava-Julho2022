package classe;

import java.util.Objects;

public class Produto {
	
	private final int codigo;
	private String categoria;
	private String descricao;
	private double preco;
	
	
	private static int contador = 1;
	
	public Produto(String categoria, String descricao, double preco) {
		
		this.codigo = contador++;
		this.setCategoria(categoria);
		this.setDescricao(descricao);
		this.setPreco(preco);
	}
	public int getCodigo() {
		return codigo;
	}
	
	
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String mostrar() {
		
		return "Código: " + this.getCodigo() + 
				"\nDescrição: " + this.getDescricao() + 
				"\nCategoria: " + this.getCategoria() + 
				"\nPreço: " + this.getPreco();	
		
	}
	@Override
	public int hashCode() {
	Double n = this.getPreco();	
		
		return this.getCodigo() + 
			   this.getDescricao().hashCode() 	 + 		  
			   n.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Produto)//quero ter certeza que o objeto enviado é um CURSO.
		{
			//typecast ?
			Produto c = (Produto)obj;	
			
			if(this.getCodigo() == c.getCodigo() &&
			   this.getDescricao().equals(c.getDescricao()) &&
			   this.getCategoria() == c.getCategoria() &&
			   this.getPreco() == c.getPreco())
			{
				return true;
			}
			
			return false;
			
			
		}
		
		return super.equals(obj);
		
	}

}
