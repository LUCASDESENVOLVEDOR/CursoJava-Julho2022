package classe;

public class Curso {
	
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
		
		return "C�digo: " + this.getCodigo() + 
				"\nDescri��o: " + this.getDescricao() + 
				"\nCarga Hor�ria: " + this.getCargaHoraria() + 
				"\nPre�o: " + this.getPreco();	
		
	}
	
	
	
	
	

}
