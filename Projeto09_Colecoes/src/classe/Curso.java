package classe;

public class Curso{
	
	private int codigo;
	private String descricao;
	private int cargaHoraria;
	private double preco;
	
	
	public Curso(int codigo, String descricao, int cargaHoraria, double preco) {
		this.setCodigo(codigo); 
		this.setDescricao(descricao); 
		this.setCargaHoraria(cargaHoraria); 
		this.setPreco(preco); 
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
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
				"\nCarga Horária: " + this.getCargaHoraria() + 
				"\nPreço: " + this.getPreco();	
		
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Curso)//quero ter certeza que o objeto enviado é um CURSO.
		{
			//typecast ?
			Curso c = (Curso)obj;	
			
			if(this.getCodigo() == c.getCodigo() &&
			   this.getDescricao().equals(c.getDescricao()) &&
			   this.getCargaHoraria() == c.getCargaHoraria() &&
			   this.getPreco() == c.getPreco())
			{
				return true;
			}
			
			return false;
			
			
		}
		
		return super.equals(obj);
	}
	
	
	
	
	

}
